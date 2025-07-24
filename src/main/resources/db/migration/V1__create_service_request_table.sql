CREATE TABLE service_request (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    tipo_limpeza VARCHAR(255) NOT NULL,
    numero_contato VARCHAR(255) NOT NULL
); 