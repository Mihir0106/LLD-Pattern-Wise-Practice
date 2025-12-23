# 🪙 CryptoSniper Trading Bot System

## 1. Overview

**CryptoSniper** is a high-frequency cryptocurrency trading system designed to process real-time market data, broadcast it to multiple independent components, and execute automated trades using dynamically switchable strategies.

The system is architected with **loose coupling**, **runtime flexibility**, and **high extensibility** in mind, making it suitable for real-time trading environments.

---

## 2. Domain Context

The system continuously ingests live price updates for cryptocurrencies such as **Bitcoin (BTC)** and **Ethereum (ETH)** and performs two key responsibilities:

1. **Broadcast Market Data**  
   Distribute price updates to all registered subscribers (UI, logging, analytics, trading bot).

2. **Automated Trading**  
   Execute buy/sell decisions using configurable trading strategies that can be changed **at runtime without restarting the system**.

---

## 3. Functional Requirements

### A. Market Data Feed (Source)

- Receives a continuous stream of price updates  
  _Example:_ `BTC → $60,000`, `ETH → $3,000`
- Notifies all active subscribers immediately upon receiving new data
- Does **not** depend on concrete subscriber implementations

---

### B. Subscribers (Observers)

The system supports multiple independent subscribers that react to market updates:

1. **Dashboard UI**
    - Displays the latest prices to the user in real time

2. **Audit Logger**
    - Records price changes along with timestamps
    - Used for compliance and historical tracking

3. **Trading Bot**
    - Analyzes incoming prices
    - Delegates trade decisions to a configurable trading strategy

> New subscribers (e.g., *Mobile Notifications*, *Analytics Engine*) can be added without changing existing core logic.

---

### C. Trading Logic (Strategies)

The **Trading Bot** uses a **pluggable strategy** to decide when to trade.  
The active strategy can be switched **while the system is running**.

#### Supported Strategies

**1. Momentum Strategy**
- Buy when the price increases by more than **2%** compared to the previous price

**2. Mean Reversion Strategy**
- Buy when the price drops by more than **5%** (buy the dip)

**3. Dollar Cost Averaging (DCA)**
- Buy a fixed amount on every price update, regardless of price

> Additional strategies (e.g., *Machine Learning Strategy*) can be introduced without modifying existing code.

---

## 4. Design Goals & Constraints

### ✅ Loose Coupling
- The Market Data Feed does not know who its subscribers are
- Subscribers depend only on shared interfaces

### 🔁 Runtime Strategy Switching
- Users can change the trading strategy on the fly
- No system restart required

### 🧩 Extensibility
- New subscribers can be added easily
- New trading strategies can be plugged in without touching core components

---

## 5. Design Patterns Used

- **Observer Pattern**
    - Market Data Feed → Subscribers (Dashboard, Logger, Trading Bot)

- **Strategy Pattern**
    - Trading Bot → Trading Strategies (Momentum, Reversion, DCA)

---
