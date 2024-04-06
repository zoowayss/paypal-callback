# 基础镜像
FROM  joengenduvel/jre17

# 设置工作目录
WORKDIR /app
WORKDIR /java/config

# 复制 jar 文件到容器中
COPY paypal-callback-0.0.1-SNAPSHOT.jar /app/

# 暴露端口
EXPOSE 8080

# 定义启动命令
CMD ["java", "-jar", "paypal-callback-0.0.1-SNAPSHOT.jar"]