import React, { useState } from 'react';
import './Nav.css'; // Nav.css 파일을 import

function Nav() {
  const [showSubMenu, setShowSubMenu] = useState(false); // 하위 버튼들의 가시성을 관리하는 상태

  // 'about us' 버튼 클릭 시 하위 버튼들의 가시성을 토글하는 함수
  const toggleSubMenu = () => {
    setShowSubMenu(!showSubMenu);
  };

  return (
    <nav id="nav">
      <ul>
        {/* Main 버튼은 링크로 설정 */}
        <li><a href="index.html" style={{fontSize: '1.2em', fontWeight: 'bold', color: 'white', textDecoration: 'none'}}>Main</a></li>
        <li>
          <button 
            className={showSubMenu ? 'active' : ''} // active 클래스 추가/제거
            onClick={toggleSubMenu}
          >
            about us
          </button>
          {/* 하위 버튼들을 상태에 따라 렌더링 */}
          {showSubMenu && (
            <ul className="sub-menu">
              <li><button>동아리부원 소개</button></li>
              <li><button>모임장소</button></li>
              <li><button>우리들의 목표</button></li>
            </ul>
          )}
        </li>
        <li><a href="project_page.html" style={{fontSize: '1.2em', fontWeight: 'bold', color: 'white', textDecoration: 'none'}}>Project</a></li>
      </ul>
    </nav>
  );
}

export default Nav;
