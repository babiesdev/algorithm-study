/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    let price_min = 10000 // 최저 주식값
    let profit = 0 // 수익
    for(let price_current in prices){
        // 현재 가격 - 최저값의 값과 수익의 값 중, 최대값을 수익값으로 보고 스왑함
        price_min = Math.min(price_current, price_min)
            
        //현재 가격 - 최저값의 값과 수익의 값 중, 최대값을 수익값으로 보고 스왑함
        profit = Math.max(profit, price_current-price_min) 
    }
    return profit
};
