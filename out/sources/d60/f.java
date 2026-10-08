package d60;

import java.util.LinkedHashMap;
import java.util.Map;
import mu.b0;
import mu.p0;
import mu.r0;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t70.z;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\b\u0010\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0080@¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00198\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld60/f;", "", "FIELD_INDEX", "Ld60/g;", "data", "<init>", "(Ld60/g;)V", "fieldIndex", "Lj1/a;", "b", "(Ljava/lang/Object;)Lj1/a;", "Loq/i0;", "d", "(Ljava/lang/Object;)V", "c", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "Ld60/g;", "", "Ljava/util/Map;", "requesters", "Lmu/b0;", "", "Lmu/b0;", "_scrollEvent", "Lmu/p0;", "Lmu/p0;", "()Lmu/p0;", "scrollEvent", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<FIELD_INDEX> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private ScrollControllerData<FIELD_INDEX> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<FIELD_INDEX, j1.a> requesters = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<Long> _scrollEvent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0<Long> scrollEvent;

    public f(ScrollControllerData<FIELD_INDEX> scrollControllerData) {
        b0<Long> b0VarA = r0.a(null);
        this._scrollEvent = b0VarA;
        this.scrollEvent = mu.i.b(b0VarA);
        this.data = scrollControllerData;
    }

    public final p0<Long> a() {
        return this.scrollEvent;
    }

    public final j1.a b(FIELD_INDEX fieldIndex) {
        Map<FIELD_INDEX, j1.a> map = this.requesters;
        j1.a aVarA = map.get(fieldIndex);
        if (aVarA == null) {
            aVarA = j1.e.a();
            map.put(fieldIndex, aVarA);
        }
        return aVarA;
    }

    public final Object c(FIELD_INDEX field_index, tq.e<? super i0> eVar) {
        if (this.data.getAnnounceValidationErrorsOnScroll()) {
            this._scrollEvent.setValue(vq.b.f(System.currentTimeMillis()));
        }
        j1.a aVar = this.requesters.get(field_index);
        if (aVar != null) {
            Object objA = j1.a.a(aVar, null, eVar, 1, null);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
        px.f.f163100a.b("Scroll failed, no registered scroll target for index: " + field_index, v.e(z.f188762a.c()));
        return i0.f148189a;
    }

    public final void d(FIELD_INDEX fieldIndex) {
        this.requesters.remove(fieldIndex);
    }
}
