CREATE TABLE IF NOT EXISTS TYPE_ROLE
(
    id_role SERIAL,
    role_name character varying,
    CONSTRAINT id_role PRIMARY KEY (id_role)
);

ALTER TABLE TYPE_ROLE OWNER to postgres;


CREATE TABLE IF NOT EXISTS USERS
(
    id_user SERIAL,
    first_name text NOT NULL,
    last_name text NOT NULL,
    email text NOT NULL,
    password character varying NOT NULL,
    address text NOT NULL,
    phone_number integer NOT NULL,
    photo text NOT NULL,
    gender text NOT NULL,
    id_role integer,
    CONSTRAINT "id_user" PRIMARY KEY (id_user),
    CONSTRAINT "fk_id_role" FOREIGN KEY (id_role)
        REFERENCES TYPE_ROLE (id_role) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE USERS OWNER to postgres;


CREATE TABLE IF NOT EXISTS ADMIN
(
    id_admin SERIAL,
    id_user long NOT NULL,
    CONSTRAINT "id_admin" PRIMARY KEY (id_admin),
    CONSTRAINT "fk_id_admin_user" FOREIGN KEY (id_user)
        REFERENCES USERS (id_user) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE ADMIN OWNER to postgres;

/*
CREATE TABLE IF NOT EXISTS "Attachment"
(
    "id_attachment" integer NOT NULL,
    "attachment_url" text NOT NULL,
    CONSTRAINT "Attachment_pkey" PRIMARY KEY ("id_attachment")
);

ALTER TABLE "Attachment" OWNER to postgres;

CREATE TABLE IF NOT EXISTS "Document"
(
    "id_document" integer NOT NULL,
    "document_url" text NOT NULL,
    "document_type" text NOT NULL,
    "id_user" integer NOT NULL,
    CONSTRAINT "Document_pkey" PRIMARY KEY ("id_document"),
    CONSTRAINT pk_user2 FOREIGN KEY ("id_user")
        REFERENCES "User" ("id_user") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Document" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "Response"
(
    "id_response" integer NOT NULL,
    "response_date" date NOT NULL,
    message text NOT NULL,
    "id_feedback" integer NOT NULL,
    "id_request" integer NOT NULL,
    CONSTRAINT "Response_pkey" PRIMARY KEY ("id_response")
);

ALTER TABLE "Response" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Feedback"
(
    "id_feedback" integer NOT NULL,
    "feedback_object" text NOT NULL,
    "feedback_description" text NOT NULL,
    "feedback_date" date NOT NULL,
    "id_user" integer,
    "id_response" integer NOT NULL,
    CONSTRAINT "Feedback_pkey" PRIMARY KEY ("id_feedback"),
    CONSTRAINT pk_user FOREIGN KEY ("id_user")
        REFERENCES "User" ("id_user") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pv_resp FOREIGN KEY ("id_response")
        REFERENCES "Response" ("id_response") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Feedback" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "News"
(
    "id_news" integer NOT NULL,
    "news_title" text,
    "news_description" text,
    "publishing_date" date,
    "id_attachment" integer NOT NULL,
    "id_admin" integer,
    CONSTRAINT "News_pkey" PRIMARY KEY ("id_news"),
    CONSTRAINT pk_admin FOREIGN KEY ("id_admin")
        REFERENCES "Admin" ("id_admin") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pk_attachment FOREIGN KEY ("id_attachment")
        REFERENCES "Attachment" ("id_attachment") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "News" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Survey"
(
    "id_survey" integer NOT NULL,
    creation_date date NOT NULL,
    closing_date date NOT NULL,
    question text NOT NULL,
    "id_admin" integer NOT NULL,
    CONSTRAINT "idSurvey" PRIMARY KEY ("id_survey"),
    CONSTRAINT pk_admin FOREIGN KEY ("id_admin")
        REFERENCES "Admin" ("id_admin") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Survey" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Proposition"
(
    "idProposition" integer NOT NULL,
    text text NOT NULL,
    count integer NOT NULL,
    "id_survey" integer NOT NULL,
    CONSTRAINT "Proposition_pkey" PRIMARY KEY ("id_proposition"),
    CONSTRAINT pk_survey FOREIGN KEY ("id_survey")
        REFERENCES "Survey" ("id_survey") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Proposition" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "Request"
(
    "id_request" integer NOT NULL,
    "start_date" date NOT NULL,
    "finish_date" date NOT NULL,
    "request_object" text NOT NULL,
    id_attachment integer NOT NULL,
    "id_response" integer,
    CONSTRAINT "Request_pkey" PRIMARY KEY ("id_request"),
    CONSTRAINT pk_attachment1 FOREIGN KEY (id_attachment)
        REFERENCES "Attachment" ("id_attachment") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pk_response FOREIGN KEY ("idResponse")
        REFERENCES "Response" ("id_response") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Request" OWNER to postgres;
*/
