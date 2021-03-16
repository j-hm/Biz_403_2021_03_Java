# git repostory(저장소)업로드 하기
##원격저장소
* http://github.com/j-hm/프로젝트.git
* 깃허브닷컴의 생성한 저장소

##로컬 프로젝트
* C:/bizworks/javaworks

##로컬 저장소
* 로컬 프로젝트를 로컬 저장소로 설정


## 깃허브 저장소 생성
1. 본인 아이디로 깃허브 접속
2. new 레파짓토리 생성
3. 아이디/Biz_403_2021_03_Java이름 저장하고 create

##로컬 저장소 설정(생성)
* 로컬 프로젝트 폴더를 로컬 저장소로 설정하기 
1. C:/bizworks/javaworks 폴더에서 git bash 실행
 - bash shell 화면 나타남. 윈도우 커멘드 창과 유사
2. 로컬 저장소 선언
 	-> git init
3. 로컬 저장소를 깃허브 계정과 연결
 	-> git config --local user.name j-hm
 	-> git config --local user.email thinkalonej@gmail.com
4. 로컬 프로젝트 압축 준비
 * 압축 금지 파일 설정
 * touch .gitignore 로 파일 생성
 * .gitignore 파일을 서브라임 택스트로 열어서 압축금지 파일 정보 등록
5. 로컬 프로젝트를 압축하여 로컬 저장소에 옮길 준비를 하라
 	-> git add .
6. 로컬 저장소에 옮겨라
 	-> git commit -m "comment"
7. 로컬 저장소에 있는 파일들을 원격 저장소로 업로드 하라
 	-> git push https://github.com/j-hm/Biz_403_2021_03_Java.git master

 	https://github.com/j-hm/Biz_403_2021_03_Java.git