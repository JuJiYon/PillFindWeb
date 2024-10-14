import React from 'react';
import './Header.css'; 

function Header() {
  return (
    <div id="header">
      <div className="inner">
        <header>
          <h1><a href="index.html" id="logo">[The Branches]</a></h1>
          <hr />
          <p>Branches는 순천대학교 인공지능공학부 전공 동아리로</p>
          <p>코딩 스터디,프로젝트 개발,공모전 참여에 열정적으로 임하는 학생 동아리 입니다.</p>
        </header>
        <footer>
          <a href="#banner" className="button circled scrolly">start</a>
        </footer>
      </div>
    </div>
  );
}

export default Header;
