package jv;

import fr.v0;
import java.util.Arrays;
import java.util.logging.Logger;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ljv/a;", "task", "Ljv/d;", "queue", "", "message", "Loq/i0;", "c", "(Ljv/a;Ljv/d;Ljava/lang/String;)V", "", "ns", "b", "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    public static final String b(long j15) {
        String str;
        if (j15 <= -999500000) {
            str = ((j15 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j15 <= -999500) {
            str = ((j15 - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j15 <= 0) {
            str = ((j15 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j15 < 999500) {
            str = ((j15 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j15 < 999500000) {
            str = ((j15 + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j15 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        v0 v0Var = v0.f66418a;
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f106030h.a();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(dVar.getName());
        sb5.append(' ');
        v0 v0Var = v0.f66418a;
        sb5.append(String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)));
        sb5.append(": ");
        sb5.append(aVar.getName());
        loggerA.fine(sb5.toString());
    }
}
