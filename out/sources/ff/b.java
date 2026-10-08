package ff;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i15, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult tresultApply;
        if (i15 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i15--;
        } while (i15 >= 1);
        return tresultApply;
    }
}
