package com.finance.portfollio.utils;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.finance.portfollio.AsyncTasks.ExchangeRatesRetriever;
import com.finance.portfollio.AsyncTasks.StockPriceRetriever;


public class AsyncTaskHelper {

    // Retrieves and displays the stock prices on the view given
    public static void DisplayStockPriceOnTextView(Activity activity, Context context, String stockCode, TextView textViewPrice)
    {
        StockPriceRetriever worker
                = new StockPriceRetriever(activity, context, stockCode, textViewPrice);
        try
        {
            worker.execute("");
        }
        catch (Exception e)
        {
            CommonUtils.Log(e.getMessage());
        }
    }

    //Retrieves a collection of Financial News from the corresponding source
    public static List<FinancialNewsElement> GetFinancialNewsElementsList(GlobalVariables.FINANCIAL_NEWS_SOURCE source)
    {
        List<FinancialNewsElement> result = new ArrayList<>();

        //Pseudo-fill, this will be replaced
        for(int i = 0; i < GlobalVariables.r.nextInt(8)+3; i++)
        {
            FinancialNewsElement crElement = new FinancialNewsElement(source.toString(), "Financial News", "https://www.cnbc.com/2020/11/07/jeff-bezos-bill-gates-and-other-tech-luminaries-react-to-biden-win.html");
            result.add(crElement);
        }

        //TODO Caner Retrieve News Element Objects From The Source

        return result;
    }

    public static double GetConvertedRate(String from_country, String to_country, double amount)
    {
        double result = amount * (GlobalVariables.CountryRates[CommonUtils.getIndexOfCurrencyCode(to_country)] /
                GlobalVariables.CountryRates[CommonUtils.getIndexOfCurrencyCode(from_country)]);
        return result;
    }

}
