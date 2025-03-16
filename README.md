# CRUD de Alunos - JHipster

Este projeto é um **CRUD para gerenciamento de alunos**, desenvolvido com **JHipster**, utilizando **Spring Boot** no backend e **Angular** no frontend.

## 🚀 Tecnologias

- **Backend:** Java 17, Spring Boot, JHipster
- **Frontend:** Angular, TypeScript
- **Banco de Dados:** PostgreSQL
- **CI/CD:** GitHub Actions

## 📌 Como Executar

### ✅ Pré-requisitos

- Java 17
- Node.js 18
- PostgreSQL

### 🔹 Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/JoaoSouza08/jhipster-crud-alunos.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd jhipster-crud-alunos
   ```
3. Instale as dependências do frontend:
   ```bash
   ./npmw install
   ```
4. Configure o banco de dados no `application.yml`.
5. Inicie o backend:
   ```bash
   ./mvnw
   ```
6. Inicie o frontend:
   ```bash
   ./npmw start
   ```
7. Acesse no navegador:
   ```
   http://localhost:8080
   ```

---

## 🛠 Desenvolvimento

### 🔹 Scripts úteis

- Atualizar dependências:
  ```bash
  ./npmw update && ./npmw install
  ```
- Executar testes:
  ```bash
  ./mvnw verify # Testes backend
  ./npmw test   # Testes frontend
  ```
- Iniciar servidor local com **Docker Compose**:
  ```bash
  docker compose -f src/main/docker/app.yml up -d
  ```
- Parar contêineres:
  ```bash
  docker compose -f src/main/docker/app.yml down
  ```

### 🔹 PWA (Progressive Web App)

Para habilitar o **Service Worker**, descomente a seguinte linha em `src/main/webapp/app/app.config.ts`:

```typescript
ServiceWorkerModule.register('ngsw-worker.js', { enabled: true }),
```

---

## 📦 Construção e Produção

### 🔹 Empacotando como JAR

```bash
./mvnw -Pprod clean verify
java -jar target/*.jar
```

Acesse `http://localhost:8080`

### 🔹 Empacotando como WAR

```bash
./mvnw -Pprod,war clean verify
```

---

## 📊 Qualidade do Código com SonarQube

Para iniciar o SonarQube:

```bash
docker compose -f src/main/docker/sonar.yml up -d
```

Para analisar o código:

```bash
./mvnw -Pprod clean verify sonar:sonar -Dsonar.login=admin -Dsonar.password=admin
```

Acesse `http://localhost:8080`

---

## 🔄 Integração Contínua

Este projeto pode ser configurado com **CI/CD** utilizando GitHub Actions. Para configurar, execute:

```bash
jhipster ci-cd
```

---

📌 **Dúvidas ou sugestões?** Sinta-se à vontade para contribuir! 😊

