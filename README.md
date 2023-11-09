# EmailSpringBoot
Código para teste de envio de e-mail através do Spring Boot

Para gerar uma senha de aplicativo com o Gmail, siga estas etapas:
1 - Acesse o Gmail.
2 - Clique no botão de engrenagem no canto superior direito da tela.
3 - Clique em "Ver todas as configurações".
4 - Clique na guia "Segurança".
5 - Na seção "Autenticação de dois fatores", clique em "Gerar senha de aplicativo".
6 - Digite um nome para a sua aplicação.
7 - Clique em "Gerar".

Em application.properties, inclua para o Gmail as seguintes configurações:
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=...@gmail.com
spring.mail.password=SenhaDeAplicativo. A senha padrão dará erro
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.smtp.ssl.trust=smtp.gmail.com
