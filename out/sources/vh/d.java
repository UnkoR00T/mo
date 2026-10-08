package vh;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends IllegalStateException {
    private d(String str, Throwable th4) {
        super(str, th4);
    }

    public static IllegalStateException a(l<?> lVar) {
        String strConcat;
        if (!lVar.p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception excL = lVar.l();
        if (excL != null) {
            strConcat = "failure";
        } else if (lVar.q()) {
            strConcat = "result ".concat(String.valueOf(lVar.m()));
        } else {
            strConcat = lVar.o() ? "cancellation" : "unknown issue";
        }
        return new d("Complete with: ".concat(strConcat), excL);
    }
}
