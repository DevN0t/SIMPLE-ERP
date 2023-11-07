CREATE TABLE public.tb_clientes (
    id SERIAL NOT NULL PRIMARY KEY,
    nome TEXT NOT NULL,
    endereco TEXT,
    plano bigint,
    cidade TEXT,
    uf varchar(2),
    cep TEXT,
    celular varchar(15),
    cpf varchar(11),
    email TEXT NOT NULL,
    igreja TEXT,
    pastor TEXT

)