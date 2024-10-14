import React from 'react';
import pic01 from '../images/pic01.jpg';
import pic02 from '../images/pic02.jpg';
import pic03 from '../images/pic03.jpg';

function Carousel() {
  return (
    <section className="carousel">
      <div className="reel">
        <article>
          <a href="#" className="image featured"><img src={pic01} alt="" width="368" height="256" /></a>
          <header>
            <h3><a href="#">Q. 어떤 스터디를 위주로 공부하나요 ?</a></h3>
          </header>
          <p>A.정확히 정해진 스터디는 따로 없고, 코딩을 하는데에 필요하다고 생각하는 스터디를 진행합니다.</p>
        </article>

        <article>
          <a href="#" className="image featured"><img src={pic02} alt="" width="368" height="256" /></a>
          <header>
            <h3><a href="#">Q.인공지능공학부 학생만 참여 가능하나요 ?</a></h3>
          </header>
          <p>A.아니요 IT관련 학과가 아니더라도 원하고자하는 목표가 있으면 모두 참여 가능합니다.</p>
        </article>

        <article>
          <a href="#" className="image featured"><img src={pic03} alt="" width="368" height="256" /></a>
          <header>
            <h3><a href="#">Q.The Branches 는 대회 준비를 하나요 ? </a></h3>
          </header>
          <p>A.The Branches 는 공모전, 창작대회 등 프로젝트 대회에 많이 참가하기 위해 노력합니다.</p>
        </article>

        <article>
          <a href="#" className="image featured"><img src={pic03} alt="" width="368" height="256" /></a>
          <header>
            <h3><a href="#">Q.The branches 의 특장점은 무엇인가요 ?</a></h3>
          </header>
          <p>A.The branches 는 스스로 어떤 공모전에 참가할지부터 어떤 결과물을 만들어 낼지 팀원 들과 함께 해나갑니다.</p>
        </article>

        <article>
          <a href="#" className="image featured"><img src={pic03} alt="" width="368" height="256" /></a>
          <header>
            <h3><a href="#">Q.동아리 활동 방식이 어떻게 되나요 ?</a></h3>
          </header>
          <p>A. The Branches 라는 이름에 맞게 각 분야별로 Branch를 구성하여 공동개발을 경험합니다.</p>
        </article>
      </div>
    </section>
  );
}

export default Carousel;
