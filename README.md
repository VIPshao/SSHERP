# 简要介绍
<p>这是一个使用SSH+json+Oracle开发的进销存中的一部分，简单实现了职工管理，销售单及销售明细管理。</p><br>
<p>结构上比较清晰，不论是打算学习SSH或者练手进销存项目都有借鉴意义。</p>
# #大体结构
<p>
>src
  >>org.erp.action
   >>> xxxxxx.java    //action类
  >>org.erp.dao
    >>>xxxxx.java      //dao接口
  org.erp.dao.impl
    xxxxxx.java       //dao的实现类
  org.erp.pojo
    xxxxxxx.java     //POJO类
    xxxxxxx.xml      //映射文件
  org.erp.services
    xxxxxxx.java    //service接口
  org.erp.services.impl
    xxxxxxx.java    //service实现类
  org.erp.tools
    xxxxxxx.java    //工具类，即公共类
  applicationContext.xml    //spring配置文件
  struts.xml      //struts2配置文件
  </p>
  大概就是这样了：
 
