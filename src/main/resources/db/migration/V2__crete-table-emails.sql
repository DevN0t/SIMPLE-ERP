CREATE TABLE public.tb_email (
    owner_ref TEXT NOT NULL,
    email_id SERIAL NOT NULL PRIMARY KEY,
    email_to TEXT NOT NULL,
    email_from TEXT NOT NULL,
    email_subject TEXT NOT NULL,
    email_text TEXT NOT NULL,
    send_date_email TIMESTAMP NOT NULL,
    status_email TEXT NOT NULL
)