package h00;

import h00.b;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;
import zx.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\u0004\b\u0002\u0010\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\bJ\u001d\u0010\u0012\u001a\u0004\u0018\u00018\u0003\"\u0004\b\u0003\u0010\u00112\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00028\u0003\"\u0004\b\u0003\u0010\u00112\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00028\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lh00/a;", "Lzx/a;", "STEP", "Lh00/b;", "RESULT", "WIZARD_DATA", "", "<init>", "()V", "step", "result", "Loq/i0;", "a", "(Lzx/a;Lh00/b;)V", "d", "(Lzx/a;)Lh00/b;", "c", "STEP_DATA", "b", "(Lzx/a;)Ljava/lang/Object;", "f", "e", "()Ljava/lang/Object;", "", "Ljava/util/Map;", "results", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<STEP extends zx.a, RESULT extends b, WIZARD_DATA> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f79185b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<STEP, RESULT> results = new LinkedHashMap();

    public final void a(STEP step, RESULT result) {
        this.results.put(step, result);
    }

    public final <STEP_DATA> STEP_DATA b(STEP step) {
        RESULT result = this.results.get(step);
        if (result != null) {
            return (STEP_DATA) result.getData();
        }
        return null;
    }

    public final void c() {
        this.results.clear();
    }

    public final RESULT d(STEP step) {
        return this.results.remove(step);
    }

    public abstract WIZARD_DATA e();

    public final <STEP_DATA> STEP_DATA f(STEP step) {
        return (STEP_DATA) ((b) v0.j(this.results, step)).getData();
    }
}
