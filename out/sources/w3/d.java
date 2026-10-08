package w3;

import fr.k;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR+\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00028V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Lw3/d;", "Lw3/c;", "Lw3/a;", "initialInputMode", "Lw3/b;", "onRequestInputModeChange", "<init>", "(ILw3/b;Lfr/k;)V", "a", "Lw3/b;", "<set-?>", "b", "Lm2/a3;", "()I", "(I)V", "inputMode", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b onRequestInputModeChange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 inputMode;

    public /* synthetic */ d(int i15, b bVar, k kVar) {
        this(i15, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w3.c
    public int a() {
        return ((a) this.inputMode.getValue()).getValue();
    }

    public void b(int i15) {
        this.inputMode.setValue(a.c(i15));
    }

    private d(int i15, b bVar) {
        this.onRequestInputModeChange = bVar;
        this.inputMode = c6.e(a.c(i15), null, 2, null);
    }
}
