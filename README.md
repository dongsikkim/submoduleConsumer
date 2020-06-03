## submodule 사용하기

현재 프로젝트에서 Lottie를 사용하되, 추가된 submodule의 dependency를 이용해 사용할 것입니다.
(현재 프로젝트의 build.gradle에는 Lottie depdency 추가하지 않음)


### 1) git 서브모듈 주소를 추가
```git
git submodule add https://github.ncsoft.com/mobiledev/submoduleCommon.git
```

그럼 이런 결과가 나옵니다.
```
kimdongikuiiMac:testProject kimdongsik$ git submodule add https://github.ncsoft.com/mobiledev/submoduleCommon.git
Cloning into '/Users/kimdongsik/testProject/submoduleCommon'...
remote: Enumerating objects: 172, done.
remote: Counting objects: 100% (172/172), done.
remote: Compressing objects: 100% (77/77), done.
remote: Total 172 (delta 32), reused 172 (delta 32), pack-reused 0
Receiving objects: 100% (172/172), 95.08 KiB | 19.02 MiB/s, done.
Resolving deltas: 100% (32/32), done.
kimdongikuiiMac:testProject kimdongsik$ 

```
이제 common을 내 프로젝트 밑으로 가져왔습니다.  
하지만 아직 common과 app모듈을 연결하지 않아 common모듈에 안에 있는 클래스를 사용하진 못합니다.  
