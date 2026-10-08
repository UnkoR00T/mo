package u4;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lu4/c0;", "", "", "Lu4/b0;", "settings", "<init>", "([Lu4/b0;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "getNeedsDensity$ui_text", "()Z", "needsDensity", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<b0> settings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean needsDensity;

    public c0(b0... b0VarArr) {
        boolean z15 = false;
        for (b0 b0Var : b0VarArr) {
            String strC = b0Var.c();
            int i15 = 0;
            for (b0 b0Var2 : b0VarArr) {
                if (fr.t.c(b0Var2.c(), strC)) {
                    i15++;
                }
            }
            if (!(i15 == 1)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append('\'');
                sb5.append(strC);
                sb5.append("' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (b0 b0Var3 : b0VarArr) {
                    if (fr.t.c(b0Var3.c(), strC)) {
                        arrayList.add(b0Var3);
                    }
                }
                sb5.append(arrayList);
                sb5.append(']');
                w4.a.a(sb5.toString());
            }
            z15 = z15 || b0Var.a();
        }
        this.settings = pq.n.n1(b0VarArr);
        this.needsDensity = z15;
    }

    public final List<b0> a() {
        return this.settings;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof c0) && fr.t.c(this.settings, ((c0) other).settings);
    }

    public int hashCode() {
        return this.settings.hashCode();
    }
}
