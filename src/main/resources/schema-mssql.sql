-- Drop Create doesnt work when database is already in use. Only creating if it doesnt exist.
IF EXISTS (SELECT * FROM sys.databases WHERE name = 'carinfodbdev') BEGIN DROP DATABASE [carinfodbdev] END
IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'carinfodbdev') BEGIN CREATE DATABASE [carinfodbdev] END