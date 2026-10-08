package b24;

import ez.e;
import java.time.LocalDate;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb24/a;", "Lzw/a;", "Lez/e;", "dateFormatter", "Lmx/c;", "labelProvider", "<init>", "(Lez/e;Lmx/c;)V", "Ljava/time/LocalDate;", "start", "end", "Lmx/a;", "a", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lmx/a;", "Lez/e;", "b", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements zw.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    public a(e eVar, mx.c cVar) {
        this.dateFormatter = eVar;
        this.labelProvider = cVar;
    }

    @Override // zw.a
    public Label a(LocalDate start, LocalDate end) {
        e eVar = this.dateFormatter;
        fz.b.LocalDate localDate = new fz.b.LocalDate(start);
        fz.c cVar = fz.c.SPACED;
        return this.labelProvider.e(s04.b.f177232p, eVar.d(localDate, cVar), this.dateFormatter.d(new fz.b.LocalDate(end), cVar));
    }
}
