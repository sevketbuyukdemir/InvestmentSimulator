package com.finance.portfollio.utils;

import org.jsoup.select.Elements;

import java.util.Random;

public class GlobalVariables
{
    public static final String[] StockCodes = new String[] { "VXX", "ITB", "IEFA", "GOVT", "EZU", "INDA", "RSX", "USMV", "NOBL", "IGV", "USHY", "CBOE", "JPST", "ARKG", "IDV", "EFAV", "VLUE", "REM", "QUAL", "BBEU", "EFV", "FLOT", "ECH", "HYD", "MTUM", "BBJP", "SLVP", "EFG", "MOAT", "IGE", "PAVE", "IYZ", "ARKQ", "ESGV", "OGIG", "IZRL", "BBCA", "HEFA", "TMFC", "ACWV", "ICSH", "IFRA", "EEMV", "PTLC", "IAGG", "VNM", "BBAX", "TOKE", "ICVT", "PJAN", "ITA", "VSGX", "ESML", "VCEB", "IQDG", "PTMC", "PRNT", "GSEW", "ESEB", "TAIL", "QVAL", "PJUL", "PAWZ", "FBCG", "NEAR", "PICK", "IYT", "IEO", "PTEU", "ITM", "PSEP", "ACES", "ESHY", "FDG", "IBMQ", "CEMB", "FCTR", "NULV", "CNYA", "SMMV", "ACIO", "ESCR", "PBUS", "HEEM", "SMIN", "DDLS", "JCPB", "DFND", "EMGF", "SMDV", "PNOV", "BBRE", "IYJ", "OUSA", "EDEN", "EPRF", "OMFL", "JMST", "SECT", "TDV", "NUSC", "VXZ", "GOVZ", "NULG", "DFEB", "NUMG", "MLN", "ATMP", "BBIN", "IETC", "ICF", "REGL", "BBUS", "SHYD", "EWUS", "EFNL", "FLDR", "OILK", "IBHD", "PTNQ", "FFHG", "COWZ", "XMPT", "MAGA", "XSHD", "FMIL", "BNOV", "MOTI", "DAUG", "POCT", "BUFR", "FFSG", "FLQL", "XVZ", "KNG", "DRSK", "IGHG", "SHAG", "CEFS", "IBHA", "UFEB", "MEAR", "RESE", "DTEC", "GVI", "GAA", "BBSA", "IGRO", "HYXU", "IEDI", "PBDM", "QLC", "FSEP", "FOCT", "IGEB", "IYLD", "NUMV", "ESG", "GTIP", "CALF", "HELX", "BSEP", "JPIB", "USEP", "SLT", "IBMN", "DEFA", "VFMO", "FBCV", "AGT", "LEAD", "KJAN", "IEHS", "ENOR", "EMHY", "OUSM", "FFTI", "IBHB", "LVHI", "IVAL", "TTAC", "VFVA", "IMOM", "UJAN", "MFMS", "WUGI", "RVRS", "DDWM", "TSOC", "JPHY", "GHYG", "FUT", "BOCT", "HSRT", "SMB", "OSCV", "DBOC", "BMAR", "USMF", "VAMO", "DOCT", "NUDM", "SVAL", "RYLD", "MAAX", "IBMO", "IEME", "GVAL", "LKOR", "QMOM", "DIVB", "PMAR", "FUNL", "BUYZ", "FLV", "NJUL", "FCPI", "IPFF", "EAOM", "IEIH", "MSVX", "FYLD", "IBHC", "PSMG", "HYDB", "EBLU", "FRDM", "IECS", "BJAN", "DURA", "FFTG", "OEUR", "ESGG", "SFIG", "GSST", "PBEE", "PSMB", "BUFF", "IBHE", "DALT", "PBSM", "DMAY", "GOAT", "HYHG", "IDHD", "TFJL", "UJUL", "IBML", "RDFI", "FLQM", "SYLD", "FIBR", "FFEB", "VFMF", "DNOV", "XJH", "EAOK", "IAUF", "NULC", "FEDX", "TILT", "VFMV", "RESD", "TBJL", "GMOM", "IMLP", "KOCT", "SPMV", "GDVD", "CSM", "EWGS", "FAUG", "PDEC", "IQM", "STOT", "EYLD", "FNOV", "FMAY", "NUEM", "NURE", "VFQY", "PSMM", "EFAD", "TRTY", "BAUG", "BLDG", "EMTL", "PEX", "RSXJ", "PAPR", "ADME", "JMUB", "TAEQ", "FDEV", "NOCT", "WFIG", "PBTP", "FLBL", "BOSS", "WFHY", "TCTL", "VMOT", "PMAY", "BJUL", "FDEM", "PWS", "TPAY", "TMDV", "ACSI", "LQDI", "NVMZ", "IBMP", "SMMD", "FJUL", "DSOC", "IBMM", "REC", "UDEC", "VIRS", "IEFN", "EAOA", "KJUL", "GSEE", "MRGR", "ALFA", "FLHY", "UMAR", "XVV", "ARCM", "LSLT", "PBND", "WLDR", "XSHQ", "ADFI", "AESR", "AFIF", "ALTS", "AMER", "AUGZ", "BAPR", "BDEC", "BFEB", "BJUN", "BMAY", "BTYS", "CFCV", "DFVL", "DFVS", "DJUL", "DJUN", "DSEP", "EAOR", "EMDV", "EMSH", "EUDV", "EURZ", "FJUN", "FLIA", "FLQS", "GCOW", "GSID", "GSUS", "HCRB", "ICOW", "JULZ", "KAPR", "KWT", "LIV", "MRSK", "MSTB", "NAPR", "NJAN", "OCTZ", "OMFS", "PAUG", "PFEB", "PJUN", "PSMC", "RODE", "RODI", "ROMO", "RTAI", "SEPZ", "SFHY", "SOVB", "STLC", "STLG", "STLV", "STMB", "STSB", "TAPR", "TEGS", "TFIV", "TFLT", "THY", "TTAI", "UAPR", "UAUG", "UJUN", "UMAY", "UNOV", "UOCT", "USEQ", "VFLQ", "VWID", "WIL", "XJR" };
    public static final String[] CountryCodes = new String[] { "CAD", "HKD", "ISK", "PHP", "DKK", "HUF", "CZK", "AUD", "RON", "SEK", "IDR", "INR", "BRL", "RUB", "HRK", "JPY", "THB", "CHF", "SGD", "PLN", "BGN", "TRY", "CNY", "NOK", "NZD", "ZAR", "USD", "MXN", "ILS", "GBP", "KRW", "MYR" };
    public static boolean isRatesDownloaded = false;
    public static double[] CountryRates = new double[CountryCodes.length];
    public static Random r = new Random();
    public static Elements FinancialNewsElements = new Elements();

    public enum FINANCIAL_NEWS_SOURCE
    {
        FINANCIAL_TIMES
    }

    public enum TRANSACTION_TYPE {
        BUY(0), SELL(1);

        TRANSACTION_TYPE(int transaction_type) {
            this.transaction_type = transaction_type;
        }

        private final int transaction_type;

        public int getTransactionType() {
            return transaction_type;
        }
    }

}
