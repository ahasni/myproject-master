CREATE TABLE IF NOT EXISTS TYPE_ROLE
(
    id_role integer NOT NULL,
    roleName character varying,
    CONSTRAINT id_role PRIMARY KEY (id_role)
);

ALTER TABLE TYPE_ROLE OWNER to postgres;


/*CREATE TABLE IF NOT EXISTS USER
(
    idUser integer NOT NULL,
    firstName text NOT NULL,
    lastName text NOT NULL,
    email text NOT NULL,
    password character varying NOT NULL,
    address text NOT NULL,
    phoneNumber integer NOT NULL,
    photo text NOT NULL,
    gender text NOT NULL,
    id_role integer,
    CONSTRAINT "user_pkey" PRIMARY KEY (idUser),
    CONSTRAINT "fk_role" FOREIGN KEY (id_role)
        REFERENCES TYPE_ROLE (id_role) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE USER OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Admin"
(
    "idAdmin" integer NOT NULL,
    "idUser" integer NOT NULL,
    CONSTRAINT "idAdmin" PRIMARY KEY ("idAdmin"),
    CONSTRAINT pk_user1 FOREIGN KEY ("idUser")
        REFERENCES "USER" ("idUser") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Admin" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Attachment"
(
    "idAttachment" integer NOT NULL,
    "attachmentUrl" text NOT NULL,
    CONSTRAINT "Attachment_pkey" PRIMARY KEY ("idAttachment")
);

ALTER TABLE "Attachment" OWNER to postgres;

CREATE TABLE IF NOT EXISTS "Document"
(
    "idDocument" integer NOT NULL,
    "documentUrl" text NOT NULL,
    "documentType" text NOT NULL,
    "idUser" integer NOT NULL,
    CONSTRAINT "Document_pkey" PRIMARY KEY ("idDocument"),
    CONSTRAINT pk_user2 FOREIGN KEY ("idUser")
        REFERENCES "User" ("idUser") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Document" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "Response"
(
    "idResponse" integer NOT NULL,
    "responseDate" date NOT NULL,
    message text NOT NULL,
    "idFeedback" integer NOT NULL,
    "idRequest" integer NOT NULL,
    CONSTRAINT "Response_pkey" PRIMARY KEY ("idResponse")
);

ALTER TABLE "Response" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Feedback"
(
    "idFeedback" integer NOT NULL,
    "feedbackObject" text NOT NULL,
    "feedbackDescription" text NOT NULL,
    "feedbackDate" date NOT NULL,
    "idUser" integer,
    "idResponse" integer NOT NULL,
    CONSTRAINT "Feedback_pkey" PRIMARY KEY ("idFeedback"),
    CONSTRAINT pk_user FOREIGN KEY ("idUser")
        REFERENCES "User" ("idUser") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pv_resp FOREIGN KEY ("idResponse")
        REFERENCES "Response" ("idResponse") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Feedback" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "News"
(
    "idNews" integer NOT NULL,
    "newsTitle" text,
    "newsDescription" text,
    "publishingDate" date,
    "idAttachment" integer NOT NULL,
    "idAdmin" integer,
    CONSTRAINT "News_pkey" PRIMARY KEY ("idNews"),
    CONSTRAINT pk_admin FOREIGN KEY ("idAdmin")
        REFERENCES "Admin" ("idAdmin") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pk_attachment FOREIGN KEY ("idAttachment")
        REFERENCES "Attachment" ("idAttachment") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "News" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Survey"
(
    "idSurvey" integer NOT NULL,
    creationdate date NOT NULL,
    closingdate date NOT NULL,
    question text NOT NULL,
    "idAdmin" integer NOT NULL,
    CONSTRAINT "idSurvey" PRIMARY KEY ("idSurvey"),
    CONSTRAINT pk_admin FOREIGN KEY ("idAdmin")
        REFERENCES "Admin" ("idAdmin") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Survey" OWNER to postgres;


CREATE TABLE IF NOT EXISTS "Proposition"
(
    "idProposition" integer NOT NULL,
    text text NOT NULL,
    count integer NOT NULL,
    "idSurvey" integer NOT NULL,
    CONSTRAINT "Proposition_pkey" PRIMARY KEY ("idProposition"),
    CONSTRAINT pk_survey FOREIGN KEY ("idSurvey")
        REFERENCES "Survey" ("idSurvey") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Proposition" OWNER to postgres;



CREATE TABLE IF NOT EXISTS "Request"
(
    "idRequest" integer NOT NULL,
    "startDate" date NOT NULL,
    "finishDate" date NOT NULL,
    "requestObject" text NOT NULL,
    id_attachment integer NOT NULL,
    "idResponse" integer,
    CONSTRAINT "Request_pkey" PRIMARY KEY ("idRequest"),
    CONSTRAINT pk_attachment1 FOREIGN KEY (id_attachment)
        REFERENCES "Attachment" ("idAttachment") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT pk_response FOREIGN KEY ("idResponse")
        REFERENCES "Response" ("idResponse") MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

ALTER TABLE "Request" OWNER to postgres;
*/