# Palaišanas instrukcija
## Nepieciešams lejupielādēt
Git - https://git-scm.com/download/win
Eclipse - https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2023-06/R/eclipse-inst-jre-win64.exe

## Lai importētu repozitoriju
1. Eclipse atvērt sadaļu "File" un uzklikšķināt "Import"
   
![image](https://github.com/H2OING/bta_tests/assets/89420403/53f68960-6ddf-47ac-97b4-a02d0d180402)
3. Uzklikškināt uz "Project from Git", kas ir zem Git mapes. Spiest pogu "Next"

![image](https://github.com/H2OING/bta_tests/assets/89420403/5865d2e1-d1b2-4142-b9a0-5107b8d083b0)
4. Uzklikškināt uz "Clone URl". Spiest pogu "Next"

![image](https://github.com/H2OING/bta_tests/assets/89420403/cd85b878-fdbe-40b3-8125-aabb25c66aaa)
5. URl teksta lodziņā iekopēt esošo git linku - https://github.com/H2OING/bta_tests.git
Spiest pogu "Next"

![image](https://github.com/H2OING/bta_tests/assets/89420403/aae490ea-6e4b-4213-add5-6d8083c38034)
6. Spiest pogu "Next"

![image](https://github.com/H2OING/bta_tests/assets/89420403/ec27dd75-bfd9-4cde-8361-5c8fa16749d9)
7. Kā zaru izvēlēties "master" zaru

![image](https://github.com/H2OING/bta_tests/assets/89420403/bf87ef9a-8bf6-4c06-b355-69432e98f9b0)
8. Spiest pogu "Next"

![image](https://github.com/H2OING/bta_tests/assets/89420403/d4c3999c-f837-4893-ac81-c6160551df44)
9. Spiest pogu "Finish"

![image](https://github.com/H2OING/bta_tests/assets/89420403/daf88305-1591-4f89-b192-eea06fd2f8c3)

## Lai startētu testu
1. Ar labo klikšķi uzpiest uz tikko importēto projektu -> Maven -> Update Project...
   
![image](https://github.com/H2OING/bta_tests/assets/89420403/79a05fea-cc35-4d3b-9923-0508da0e9b3c)
3. Kad visas bibliotēkas ir atjaunotas, ar labo klikšķi uzpiest uz projektu -> Run As -> 2. JUnit test
