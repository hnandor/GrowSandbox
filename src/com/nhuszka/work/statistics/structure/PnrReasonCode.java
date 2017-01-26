package com.nhuszka.work.statistics.structure;

public enum PnrReasonCode {

    PNRMRALLSEGSHXACTION,
    PNRMRALLSEGSHXHKACTION,
    PNRMRALLSEGSHXTKACTION,
    PNRMRALLSEGSHXTKHKACTION,
    PNRMRALLSEGSTKACTION,
    PNRMRALLSEGSTKHKACTION,
    PNRMRCABINUP,
    PNRMRCARRIERACTIONSUM,
    PNRMRCARRIERACTIONSUMHIST,
    PNRMRCARRIERACTIONSUMOSI,
    PNRMRCLASSACTIONSUM,
    PNRMRCLASSACTIONSUMHIST,
    PNRMRDIFFMINOR_ARR,
    PNRMRDIFFMINOR_ARR_HIST,
    PNRMRDIFFMINOR_ARR_OSI,
    PNRMRDIFFMINOR_DEP,
    PNRMRDIFFMINOR_DEP_HIST,
    PNRMRDIFFMINOR_DEP_OSI,
    PNRMRDIFFNOMINAL_ARR,
    PNRMRDIFFNOMINAL_ARR_HIST,
    PNRMRDIFFNOMINAL_ARR_OSI,
    PNRMRDIFFNOMINAL_DEP,
    PNRMRDIFFNOMINAL_DEP_HIST,
    PNRMRDIFFNOMINAL_DEP_OSI,
    PNRMRDIFFZEROMINUTE_DEP,
    PNRMRDIFFZEROMINUTE_DEP_HIST,
    PNRMRFLTNBRACTION,
    PNRMRFLTNBRACTIONSUMHIST,
    PNRMRFLTNBRACTIONSUMOSI,
    PNRMRGDSMODIFY,
    PNRMRHXUPGRADEACTION,
    PNRMROPCAACTIONSUM,
    PNRMRPDHXNOUNUCXNLD,
    PNRMRPDHXNOUNUCXNLDWITHCONFMATCH,
    PNRMRPDHXNOUNUCXNLDWITHHK,
    PNRMRPDLIVEHKXNLDWITHHXNOUNUC,
    PNRMRPDMAJOR;

    public static PnrReasonCode getReasonCode(String reasonCodeStr) {
        return PnrReasonCode.valueOf(reasonCodeStr);
    }
}
