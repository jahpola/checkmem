FROM public.ecr.aws/amazoncorretto/amazoncorretto:21

WORKDIR /tmp
COPY Check.java /tmp/check.java

ENTRYPOINT [ "java","check.java" ] 