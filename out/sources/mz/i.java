package mz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001a¨\u0006\u001b"}, d2 = {"Lmz/i;", "Lkx/d;", "Lmz/h;", "Lkx/e;", "intentActionMapper", "<init>", "(Lkx/e;)V", "Lkx/g;", "intentType", "Landroid/content/Intent;", "c", "(Lkx/g;)Landroid/content/Intent;", "intent", "Lkx/f;", "b", "(Landroid/content/Intent;)Lkx/f;", "LCON/p;", "activity", "Loq/i0;", "e", "(LCON/p;)V", "Lkx/a;", "intentAction", "a", "(Lkx/a;)Lkx/f;", "Lkx/e;", "LCON/p;", "intent_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements kx.d, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kx.e intentActionMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private CON.p activity;

    public i(kx.e eVar) {
        this.intentActionMapper = eVar;
    }

    private final kx.f b(Intent intent) throws Exception {
        CON.p pVar = this.activity;
        if (pVar == null) {
            return kx.f.a.f112942a;
        }
        try {
            pVar.startActivity(intent);
            return kx.f.c.f112944a;
        } catch (Exception e15) {
            px.f.f163100a.d("DispatchIntent: startActivity error", e15, px.c.a(this));
            if (e15 instanceof CancellationException) {
                throw e15;
            }
            return e15 instanceof ActivityNotFoundException ? kx.f.b.f112943a : kx.f.a.f112942a;
        }
    }

    private final Intent c(kx.g intentType) {
        Integer numP;
        Intent intent = new Intent(intentType.a(), intentType instanceof b0 ? ((b0) intentType).getUri() : null);
        intent.setFlags(268435456);
        if (intentType instanceof b) {
            intent.setData(((b) intentType).getData());
        }
        if ((intentType instanceof e) && (numP = ((e) intentType).p()) != null) {
            intent.addFlags(numP.intValue());
        }
        if (intentType instanceof d) {
            intent.putExtras(((d) intentType).getExtras());
        }
        if (!(intentType instanceof o)) {
            return intent;
        }
        intent.setType(((o) intentType).b());
        return Intent.createChooser(intent, null);
    }

    @Override // kx.d
    public kx.f a(kx.a intentAction) {
        return b(c(this.intentActionMapper.b(intentAction)));
    }

    @Override // oz.c
    public void e(CON.p activity) {
        this.activity = activity;
    }
}
