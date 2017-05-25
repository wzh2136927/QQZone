package com.wxf.zone.service.impl;

import java.util.List;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxf.zone.dao.UserDao;
import com.wxf.zone.entity.QQResult;
import com.wxf.zone.entity.User;
import com.wxf.zone.service.UserLoginService;
import com.wxf.zone.util.QQZoneException;
import com.wxf.zone.util.QQZoneUtil;
@Service
public class UserLoginServiceImpl implements UserLoginService{
@Autowired
private UserDao dao;
public QQResult checkNumber(String number,String password){
try {
	QQResult result = new QQResult();
User user =   dao.findByNumber(number);
	if (user==null) {
		result.setStatus(1);
		result.setMsg("用户不存在");
	} else {
		 
		// System.out.println(user.getQq_user_password()+"数据库中的密码");
		String base64_msg = QQZoneUtil.md5(password);
		
		if(user.getQq_user_password().equals(password)) {
			//System.out.println("密码验证正确");
			result.setStatus(0);
			result.setMsg("正确");
			result.setData(user);
			// 传出userId和用户token令牌
//			 String token=Util.createToken();
//			 Map<String,Object>data=new HashMap<String,Object>();
//			 data.put("userToken", token);
//			 data.put("userId", user.getCn_user_id());
//			 result.setData(data);
			 //将令牌号更新到数据表cn_user
			 
		} else {
			result.setStatus(2);
			result.setMsg("密码不正确");
		}
	}
	return result;

} catch (Exception ex) {

	ex.printStackTrace();
	 throw new  QQZoneException(ex.getMessage()+"");
}
}

public QQResult checkNumber(String author)  {
	// TODO Auto-generated method stub
	//System.out.println(author + "autfdd");
	try {
		// 解析省份信息 获取"Basic 加密信息" 部分的消息
		String base64_msg = author.split(" ")[1];
		//System.out.println("密文" + base64_msg);
		// 将"加密消息" 还原成明文 用户名:密码
		byte[] output = Base64.decodeBase64(base64_msg);
		// 切割 用户名 :密码 获取用户名和密码信息
		String msg = new String(output, "UTF-8");
		//System.out.println("明文" + msg);
		String name = msg.split(":")[0];
		String password = msg.split(":")[1];
		//System.out.println(password);
		QQResult result = checkNumber(name, password);
		return result;
	} catch (Exception ex) {
		throw new QQZoneException(ex.getMessage());// 运行是异常
	}

}

 

}
