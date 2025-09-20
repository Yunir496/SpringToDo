-- Переводим первичный ключ на BIGINT
ALTER TABLE public.todos
ALTER COLUMN id TYPE BIGINT;
