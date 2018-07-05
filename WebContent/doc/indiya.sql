-- 회원
DROP TABLE member CASCADE CONSTRAINTS;
CREATE TABLE member (
    id              VARCHAR2(16) NOT NULL,
    pass            VARCHAR2(16) NOT NULL,
    name            VARCHAR2(10) NOT NULL,
    sex             VARCHAR2(1)  NOT NULL,           --남성:M, 여성 F
    picture         VARCHAR2(50) NULL,
    musician_flag   VARCHAR2(1)  DEFAULT 'N',        -- Y:뮤지션, N:관객(기본값)
    --musician_status VARCHAR2(1)  NULL,               -- A:신청, C:승인, X:취소
    join_date       DATE         DEFAULT SYSDATE,    
   
    CONSTRAINT member_pk PRIMARY KEY(id)
);

-- 문의
DROP TABLE faq CASCADE CONSTRAINTS;
CREATE TABLE faq (
    no          NUMBER          NOT NULL,
    faq_id      VARCHAR2(16)    NOT NULL,
    subject     VARCHAR2(100)   NOT NULL,
    contents    VARCHAR2(1000)  NOT NULL,
    answer      VARCHAR2(1000)  NULL,
    faq_stats   NUMBER(1)       DEFAULT 0,  -- 0:답변중, 1:답변완료
    write_date  DATE            DEFAULT SYSDATE,
    answer_date DATE            NULL,
    CONSTRAINT faq_pk PRIMARY KEY(no),
    CONSTRAINT faq_id_fk FOREIGN KEY(faq_id) REFERENCES member(id)   
);
DROP SEQUENCE faq_seq;
CREATE SEQUENCE faq_seq INCREMENT BY 1 START WITH 1;

-- 설문조사
DROP TABLE poll CASCADE CONSTRAINTS;
CREATE TABLE poll (
    no          NUMBER          NOT NULL,
    subject     VARCHAR2(100)   NOT NULL,
    contents    VARCHAR2(500)   NULL,
    poll_flag   NUMBER(1)       DEFAULT 0, -- 0:설문조사 진행중, 1:설문조사 완료
    view_flag   NUMBER(1)       DEFAULT 0, -- 0:메인화면에 안보이기 , 1: 메인화면에 보이기   
    write_date  DATE            DEFAULT SYSDATE,
  
    CONSTRAINT poll_pk PRIMARY KEY(no)
);
DROP TABLE poll_item CASCADE CONSTRAINTS;
CREATE TABLE poll_item (
    no          NUMBER          NOT NULL,
    poll_no     NUMBER          NOT NULL,
    item        VARCHAR2(100)   NOT NULL,
    count       NUMBER          DEFAULT 0,
    
    CONSTRAINT poll_item_pk PRIMARY KEY(no),
    CONSTRAINT poll_item_poll_no_fk FOREIGN KEY(poll_no) REFERENCES poll(no)
);   
DROP SEQUENCE poll_seq;
CREATE SEQUENCE poll_seq INCREMENT BY 1 START WITH 1; --poll과 poll_item 같이 씀

-- 배너
DROP TABLE banner CASCADE CONSTRAINTS;
CREATE TABLE banner (
    no          NUMBER         NOT NULL,
    title       VARCHAR2(100)   NOT NULL,
    pic         VARCHAR2(100)   NOT NULL,
    banner_view NUMBER(1)       DEFAULT 1,      
    write_date  DATE            DEFAULT SYSDATE 
);

-- 공지사항
DROP TABLE notice  CASCADE CONSTRAINTS;
CREATE TABLE notice (
    no          NUMBER          NOT NULL,
    title       VARCHAR2(100)   NOT NULL,
    contents    VARCHAR2(3000)  NOT NULL,
    visited     NUMBER          NOT NULL,
    write_date  DATE            DEFAULT SYSDATE,
    CONSTRAINT notice_pk PRIMARY KEY(no)
);
DROP SEQUENCE notice_seq;
CREATE SEQUENCE notice_seq INCREMENT BY 1 START WITH 1; --banner, notice 같이 씀


-- 자유게시판
DROP TABLE board  CASCADE CONSTRAINTS;
CREATE TABLE board (
    no          NUMBER          NOT NULL,
    member_id   VARCHAR2(16)    NOT NULL,
    title       VARCHAR2(200)   NOT NULL,
    contents    VARCHAR2(500)   NOT NULL,
    visited     NUMBER          DEFAULT 0,
    write_date  DATE            DEFAULT SYSDATE,
    
    CONSTRAINT board_pk PRIMARY KEY(no)
);

DROP TABLE board_comment  CASCADE CONSTRAINTS;
CREATE TABLE board_comment (
    no          NUMBER          NOT NULL,
    board_no    NUMBER          NOT NULL,
    member_id   NUMBER          NOT NULL,
    contents    VARCHAR2(500)   NOT NULL,
    write_date  DATE            DEFAULT SYSDATE,
    
    CONSTRAINT board_comment_pk PRIMARY KEY(no),
    CONSTRAINT board_comment_board_no_fk FOREIGN KEY(board_no) REFERENCES board(no)
);

DROP SEQUENCE board_seq;
CREATE SEQUENCE board_seq INCREMENT BY 1 START WITH 1; --  board, board_comment 같이 씀

-- 구인
DROP TABLE jam CASCADE CONSTRAINTS;
CREATE TABLE jam (
    no          NUMBER          NOT NULL,
    gubun       NUMBER(1)       DEFAULT 1,      -- 1: 구인, 2: 구직
    member_id   VARCHAR2(16)    NOT NULL,
    subject     VARCHAR2(100)   NOT NULL,
    contents    VARCHAR2(1000)  NOT NULL,
    visited     NUMBER          DEFAULT 0,
    complete    NUMBER(1)       DEFAULT 0,      -- 0:진행중, 1:완료
    write_date  DATE            DEFAULT SYSDATE,
    
    CONSTRAINT jam_pk PRIMARY KEY(no),
    CONSTRAINT jam_id_fk FOREIGN KEY(member_id) REFERENCES member(id)
);

-- 구인 신청
DROP TABLE jam_apply CASCADE CONSTRAINTS;
CREATE TABLE jam_apply (
    jam_no          NUMBER          NOT NULL,
    member_id        VARCHAR2(16)    NOT NULL,
    position        VARCHAR2(50)    NOT NULL,
    contents        VARCHAR2(1000)  NOT NULL,
    apply_stats     NUMBER(1)       DEFAULT 0,     -- 0:대기, 1:맴버승인, 2:맴버거절
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT jam_apply_no_fk FOREIGN KEY(jam_no) REFERENCES jam(no),
    CONSTRAINT jam_apply_id_fk FOREIGN KEY(member_id) REFERENCES member(id)
);

-- 구인 댓글
DROP TABLE jam_comment CASCADE CONSTRAINTS;
CREATE TABLE jam_comment (
    jam_no          NUMBER          NOT NULL,
    member_id      VARCHAR2(16)    NOT NULL,
    contents        VARCHAR2(1000)  NOT NULL,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT jam_comment_no_fk FOREIGN KEY(jam_no) REFERENCES jam(no),
    CONSTRAINT jam_comment_member_id_fk FOREIGN KEY(member_id) REFERENCES member(id)    
);
DROP SEQUENCE jam_seq;
CREATE SEQUENCE jam_seq INCREMENT BY 1 START WITH 1;

-- 뮤지션
DROP TABLE musician CASCADE CONSTRAINTS;
CREATE TABLE musician (
    musician_id     VARCHAR2(16)    NOT NULL,
    musician_name   VARCHAR2(100)    NOT NULL,
    musician_info   VARCHAR2(1000)  NOT NULL,
    musician_like   NUMBER          DEFAULT 0,
    listener_count  NUMBER          DEFAULT 0,       -- 평점을 계산하기위한 리스너 숫자
    listener_grade  NUMBER          DEFAULT 0,       -- 1-5점사이 업데이트
    area            VARCHAR2(50)    NOT NULL,
    pic             VARCHAR2(50)    NOT NULL,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT musician_pk PRIMARY KEY(musician_id),
    CONSTRAINT musician_id_fk FOREIGN KEY(musician_id) REFERENCES member(id)
);
DROP SEQUENCE musician_seq;
CREATE SEQUENCE musician_seq INCREMENT BY 1 START WITH 1;

-- 뮤지션 맴버
DROP TABLE musician_member CASCADE CONSTRAINTS;
CREATE TABLE musician_member (
    musician_id     VARCHAR2(16)    NOT NULL,
    member_id       VARCHAR2(16)    NOT NULL,
    position        VARCHAR2(50)    NOT NULL,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT musician_member_musician_id_fk FOREIGN KEY(musician_id) REFERENCES musician(musician_id),
    CONSTRAINT musician_member_member_id_fk FOREIGN KEY(member_id) REFERENCES member(id)
);
-- 뮤지션 공연일정
DROP TABLE musician_show CASCADE CONSTRAINTS;
CREATE TABLE musician_show (
    no              NUMBER          NOT NULL,
    musician_id     VARCHAR2(16)    NOT NULL,
    show_title      VARCHAR2(100)   NOT NULL,
    music_genre     NUMBER(2)       NOT NULL,   -- 장르 카테고리 테이블이 필요함
    show_place      VARCHAR2(200)   NOT NULL,
    show_date       VARCHAR2(10)    NOT NULL,
    show_time       VARCHAR2(10)    NOT NULL,
    in_outdoors     VARCHAR2(1)     DEFAULT 'I', -- 실내, O:실외
    show_info       VARCHAR2(1000)   NULL,
    show_pic        VARCHAR2(100)   NULL,
    latitude        VARCHAR2(15)    NOT NULL,
    longtitude      VARCHAR2(15)    NOT NULL,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT musician_show_pk PRIMARY KEY(no),
    CONSTRAINT musician_show_id_fk FOREIGN KEY(musician_id) REFERENCES musician(musician_id)
);
DROP SEQUENCE musician_show_seq;
CREATE SEQUENCE musician_show_seq INCREMENT BY 1 START WITH 1;

-- 뮤지션 공연 영상
-- 스트리밍 영상은 아니고, 유투브 링크로 할때
DROP TABLE musician_show_movie CASCADE CONSTRAINTS;
CREATE TABLE musician_show_movie (
    no              NUMBER          NOT NULL,
    musician_id     VARCHAR2(16)    NOT NULL,
    show_title      VARCHAR2(100)   NOT NULL,
    show_place      VARCHAR2(200)   NOT NULL,
    show_date       DATE            NOT NULL,
    show_movie_url  VARCHAR2(200)   NOT NULL,
    visited         NUMBER          DEFAULT 0,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT musician_show_movie_pk PRIMARY KEY(no),
    CONSTRAINT musician_show_movie_id_fk FOREIGN KEY(musician_id) REFERENCES musician(musician_id)     
);
DROP SEQUENCE musician_show_movie_seq;
CREATE SEQUENCE musician_show_movie_seq INCREMENT BY 1 START WITH 1;

-- 뮤지션 음악
DROP TABLE musician_music CASCADE CONSTRAINTS;
CREATE TABLE musician_music (
    no              NUMBER          NOT NULL,
    musician_id     VARCHAR2(16)    NOT NULL,
    music_title     VARCHAR2(50)    NOT NULL, 
    music_src       VARCHAR2(100)   NOT NULL,

    CONSTRAINT musician_music_pk PRIMARY KEY(no),
    CONSTRAINT musician_music_id_fk FOREIGN KEY(musician_id) REFERENCES musician(musician_id)     
);

DROP SEQUENCE musician_music_seq;
CREATE SEQUENCE musician_music_seq INCREMENT BY 1 START WITH 1;

-- 뮤지션 댓글
DROP TABLE musician_comment CASCADE CONSTRAINTS;
CREATE TABLE musician_comment (
    no              NUMBER          NOT NULL,
    musician_id     VARCHAR2(16)    NOT NULL,
    member_id       VARCHAR2(16)    NOT NULL,
    contents        VARCHAR2(500)   NOT NULL,
    write_date      DATE            DEFAULT SYSDATE,
    
    CONSTRAINT musician_comment_pk PRIMARY KEY(no),
    CONSTRAINT musician_comment_id_fk FOREIGN KEY(musician_id) REFERENCES musician(musician_id)  
);
DROP SEQUENCE musician_comment_seq;
CREATE SEQUENCE musician_comment_seq INCREMENT BY 1 START WITH 1;

