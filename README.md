# iBatis-Oracle

MyBatis framework is used to connect Oracle database.
MyBatis began life as iBATIS back in 2001 moving to Apache some years later. While at Apache it gathered quite the following until competing DAO solutions emerged, despite this, the project kept going now outside of Apache and renamed to MyBatis. However the legacy of iBATIS continues on, you may find it in some package names. Given the history is no surprise there are organizations still running MyBatis to this day. Let's go through a quick introduction and demonstration, shall we?

MyBatis offers a couple of options for mapping SQL statements to Java types. Due to its origins during the dot-com bubble you can expect XML heavy configuration, like many tools of the time. As time passed by more Java oriented options were added thus you'll find naming conventions and an annotation-based API that may be familiar to many; and it's due to this familiarity that I'll stick with the annotation API though the documentation states there are use cases where the XML configuration is less verbose than the alternative.
 a
New ibatis command
