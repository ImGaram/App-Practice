package com.example.domain.githubexample.model

// github repository에 대한 정보를 가지고 있으며, 안드로이드의 의존성을 가지지 않게 작성한다.
// data class로 만들어도 되지만, data 계층에서 mapper를 통해 변환해주면 그만큼 별도의 연산이 필요하기 때문에
// data계층의 모델이 GithubRepo를 구현하는 방식으로 설계함
interface GithubRepo {
    val name: String
    val url: String
}