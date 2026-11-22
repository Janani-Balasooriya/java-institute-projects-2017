# Java Institute Projects (2017)

> **Archive note:** These projects were originally built in **2017** at the
> **Java Institute for Advanced Technology** and are archived here in 2026, unchanged.
> Where the original project files are included, they are zipped to keep their original
> file dates. The group project's Software Requirements Specification is dated
> **16 September 2017**.

This repository contains two separate projects from the start of my software engineering
journey, both in the textile retail domain but built separately, with a different scope:

| | Project | My role | Evidence |
|---|---|---|---|
| 1 | [Textile Wholesale & Retail Management System](#1-textile-wholesale--retail-management-system-group-project) | **Group Leader**, five-person team | Software Requirements Specification |
| 2 | [Textile Pack Sales & Inventory System](#2-textile-pack-sales--inventory-system-individual-project) | **Sole developer**, individual viva | Technical report with source code |

---

## 1. Textile Wholesale & Retail Management System (Group Project)

📄 **[Software Requirements Specification (PDF)](group-project/Textile_Wholesale_Retail_Management_System_SRS_2017.pdf)**

A desktop management system for a **wholesale and retail textile business**, designed to
replace the shop's manual record-keeping. Built by team **HYPERTHINK SOLUTION**.

### The problem
The business handled wholesale and retail sales, stock, cheques and customer accounts by
hand. That made reporting slow and mistakes common. The goal was one system covering the
full sales and stock cycle, with reports for the owner and access that depended on each
staff member's role.

### My role: Group Leader
- Led and coordinated a five-person team through analysis, design and development
- Led requirements gathering with a real-world business scenario
- Led the **Software Requirements Specification**: user roles, 28 interface
  specifications, functional, non-functional and security requirements
- Led the system modelling: **UML use case, activity and sequence diagrams** and the
  **ER model**
- Presented the finished system to the evaluation panel

### Scope
- **Sales:** wholesale and retail invoicing, discounts, customer loyalty cards
- **Stock:** GRN, pack configuration, unpacking and transfer from wholesale to retail,
  retail stock
- **Returns:** items, packs and retail returns, with return history
- **Payments:** cheque registration, returned-cheque handling, due-payment tracking
- **Administration:** customer, supplier, employee and category registration; role-based
  privileges for **Admin (Owner), Manager, Cashier and Coordinator**; password recovery;
  database backup; daily, weekly and monthly reports

### Team
Janani Balasooriya (Group Leader) · Viranga Gamage · Sandeep Weerathunga ·
Rashani Hathurusingha · Dulanjani Basnayaka
Instructor: Mr. H.D. Thilan Lakshitha

---

## 2. Textile Pack Sales & Inventory System (Individual Project)

📘 **[Technical report with source code (PDF)](individual-project/Textile_Pack_Sales_Inventory_System_2017.pdf)**

A complete sales and inventory system for a textile shop that sells clothing in packs by
category. I designed, built and documented it **on my own**, and presented it at my
**individual viva**.

### What I built: 22 modules
- **Security:** login with lockout after 3 failed attempts and an activity log;
  password recovery with an emailed PIN (JavaMail)
- **Users:** administrator home, account settings, new user accounts linked to registered
  employees (NIC check)
- **Stock:** categories, GRN, pack configuration, stock view
- **Sales:** invoicing, discount limits, returns (within one week, packaging undamaged),
  sales view
- **Payments:** cheque management, cheque search, cheque details on invoices, due payments
- **Partners:** supplier and customer registration and details
- **Maintenance:** database backup

The report covers the use case and ER diagrams, then walks through every screen with its
source code: imports, constructor, methods and button handlers.

---

## Tech stack (2017)
| | |
|---|---|
| Language | Java (JRE 1.8) |
| UI | Java Swing |
| Database | MySQL 5.6 |
| IDE | NetBeans 8.0.2 |
| Libraries | JavaMail |
| Design | UML (use case, activity, sequence), ER modelling, normalised relational schema |
| Platform | Windows desktop |

---

## Looking back (2026)
These were among my first complete systems, and I've kept them exactly as they were.
If I built them today, I would:
- Split the system into a **Spring Boot REST API** and a web or mobile client, instead of
  one desktop app
- Replace hard-coded credentials and security questions with **hashed passwords,
  token-based authentication and environment-based configuration**
- Use a **layered architecture** (controller, service, repository) instead of logic in UI
  event handlers
- Manage the database schema with **migrations (Flyway)** and add **automated tests and
  CI** from the start

Many of these ideas are in my later work. See **FinMate**
([backend](https://github.com/Janani-Balasooriya/finmate-backend) ·
[frontend](https://github.com/Janani-Balasooriya/finmate-frontend)), a Spring Boot + React
family finance platform with JWT, role-based access and Flyway migrations, and my
open-source contributions to **OpenMRS**.

---

**Janani Balasooriya** · [GitHub](https://github.com/Janani-Balasooriya) ·
[LinkedIn](https://linkedin.com/in/janani-balasooriya)
