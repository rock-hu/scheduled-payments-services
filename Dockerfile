FROM dragonwell-registry.cn-hangzhou.cr.aliyuncs.com/dragonwell/dragonwell:17
# RUN addgroup -S spring && adduser -S spring -G spring
# USER spring:spring
ADD ./target/scheduled-payments-services.jar scheduled-payments-services.jar
ENTRYPOINT ["java","-jar","/scheduled-payments-services.jar"]
