-- V2: Migration para adicionar a coluna de EQUIPE na tabela de cadastros de corredores

ALTER TABLE tb_runners
ADD COLUMN equipe VARCHAR(255);