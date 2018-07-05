--funding.sql

DROP TABLE funding CASCADE CONSTRAINTS;
CREATE TABLE funding(
   no            	NUMBER          NOT NULL,   --글번호   PK
   musician_id     	VARCHAR2(16)    NOT NULL,   --뮤지션아이디 FK
   category      	VARCHAR2(16)    NOT NULL,   --카테고리명 (음반, 공연)
   goal         	NUMBER          NOT NULL,   --목표금액
   open         	DATE  	        NOT NULL,   --시작일
   close          	DATE  	        NOT NULL,   --종료일
   pic              VARCHAR2(100)   NOT NULL,   --대표이미지
   title         	VARCHAR2(50)    NOT NULL,   --제목
   contents      	CLOB     	    NOT NULL,   --내용
   write_date   	DATE            DEFAULT SYSDATE,   --작성일
   
   CONSTRAINT funding_pk PRIMARY KEY(no),
   CONSTRAINT musician_id_fk FOREIGN KEY(musician_id) REFERENCES member(id)
);

DROP SEQUENCE funding_seq;
CREATE SEQUENCE funding_seq INCREMENT BY 1 START WITH 1;

DROP TABLE funding_reward CASCADE CONSTRAINTS;
CREATE TABLE funding_reward(
   no             NUMBER         NOT NULL,   --글번호 FK
   amount         NUMBER         NOT NULL,   --기준금액
   pic            VARCHAR2(100)  NOT NULL,   --이미지
   title          VARCHAR2(50)   NOT NULL,   --제목
   contents       CLOB           NOT NULL,   --내용
   
   CONSTRAINT funding_reward_no_fk FOREIGN KEY(no) REFERENCES funding(no)
);

DROP TABLE funding_status CASCADE CONSTRAINTS;
CREATE TABLE funding_status(
   no             NUMBER         NOT NULL,   --글번호 FK
   amount         NUMBER         NOT NULL,   --현재달성금액
   status         VARCHAR2(1)    DEFAULT 'W',   --상태(W승인대기, S진행, E종료)
   
   CONSTRAINT funding_status_no_fk FOREIGN KEY(no) REFERENCES funding(no)
);

DROP TABLE backer CASCADE CONSTRAINTS;
CREATE TABLE backer(
   no              NUMBER         NOT NULL,   --글번호 FK
   member_id       VARCHAR2(16)   NOT NULL,   --회원아이디 FK
   amount          NUMBER         NOT NULL,   --후원금액
   
   CONSTRAINT backer_no_fk FOREIGN KEY(no) REFERENCES funding(no)
);