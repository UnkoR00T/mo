package s00;

import CON.p;
import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import dx.i;
import fr.t;
import ju.p0;
import mu.a0;
import mu.h0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import vq.j;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010\u0019J\u0017\u0010)\u001a\u00020\u00152\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020'0+H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00101R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u0016\u00105\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020'0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00106¨\u00068"}, d2 = {"Ls00/a;", "Lcy/a;", "Ls00/c;", "Ls00/d;", "Landroid/content/Context;", "context", "Lgy/a;", "permissionManager", "Ls00/b;", "edoNfcTagReader", "<init>", "(Landroid/content/Context;Lgy/a;Ls00/b;)V", "", "i", "()Z", "j", "isEnabled", "Lcy/b;", "preset", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Lcy/b;Ltq/e;)Ljava/lang/Object;", "g", "()V", "LCON/p;", "activity", "e", "(LCON/p;)V", "Landroid/nfc/NfcAdapter$ReaderCallback;", "readerCallback", "Landroid/os/Bundle;", "bundle", "", "flags", "d", "(Landroid/nfc/NfcAdapter$ReaderCallback;Landroid/os/Bundle;I)V", "a", "Lcy/c;", "readerResult", "f", "(Lcy/c;)V", "Lmu/a0;", "k", "()Lmu/a0;", "Landroid/content/Context;", "b", "Lgy/a;", "Ls00/b;", "LCON/p;", "Landroid/nfc/NfcAdapter;", "Landroid/nfc/NfcAdapter;", "nfcAdapter", "Lmu/a0;", "readerResultFlow", "nfc_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements cy.a, c, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gy.a permissionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s00.b edoNfcTagReader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p activity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NfcAdapter nfcAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a0<cy.c> readerResultFlow = h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: s00.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4523a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177006d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f177007e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f177009g;

        C4523a(tq.e<? super C4523a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177007e = obj;
            this.f177009g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f177010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f177011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ cy.c f177012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f177013h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cy.c cVar, a aVar, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f177012g = cVar;
            this.f177013h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f177011f;
            Object objE = uq.b.e();
            int i15 = this.f177010e;
            if (i15 == 0) {
                u.b(obj);
                f.f163100a.b("onRead, result: " + this.f177012g, px.c.a(p0Var));
                a0 a0Var = this.f177013h.readerResultFlow;
                cy.c cVar = this.f177012g;
                this.f177011f = j.a(p0Var);
                this.f177010e = 1;
                if (a0Var.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f177012g, this.f177013h, eVar);
            bVar.f177011f = obj;
            return bVar;
        }
    }

    public a(Context context, gy.a aVar, s00.b bVar) {
        this.context = context;
        this.permissionManager = aVar;
        this.edoNfcTagReader = bVar;
        this.nfcAdapter = NfcAdapter.getDefaultAdapter(context);
    }

    private final boolean i() {
        return t.c(this.permissionManager.h(gy.d.NFC), gy.c.a.f78236a);
    }

    @Override // s00.d
    public void a() {
        NfcAdapter nfcAdapter;
        f.f163100a.b("stopReading", px.c.a(this));
        p pVar = this.activity;
        if (pVar == null || (nfcAdapter = this.nfcAdapter) == null) {
            return;
        }
        nfcAdapter.disableReaderMode(pVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // cy.a
    public Object c(cy.b bVar, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        C4523a c4523a;
        if (eVar instanceof C4523a) {
            c4523a = (C4523a) eVar;
            int i15 = c4523a.f177009g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c4523a.f177009g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c4523a = new C4523a(eVar);
            }
        } else {
            c4523a = new C4523a(eVar);
        }
        Object obj = c4523a.f177007e;
        Object objE = uq.b.e();
        int i16 = c4523a.f177009g;
        if (i16 == 0) {
            u.b(obj);
            f fVar = f.f163100a;
            fVar.b("enableReading", px.c.a(this));
            if (!j()) {
                return new i.Left(dx.b.h.C1033b.f45083a);
            }
            if (!isEnabled()) {
                return new i.Left(dx.b.h.c.f45084a);
            }
            if (!i()) {
                return new i.Left(dx.b.h.a.f45082a);
            }
            fVar.b("enable preset: " + bVar, px.c.a(this));
            if (!(bVar instanceof cy.b.a)) {
                throw new oq.p();
            }
            s00.b bVar2 = this.edoNfcTagReader;
            c4523a.f177006d = j.a(bVar);
            c4523a.f177009g = 1;
            if (bVar2.a(this, bVar, c4523a) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        return new i.Right(i0.f148189a);
    }

    @Override // s00.d
    public void d(NfcAdapter.ReaderCallback readerCallback, Bundle bundle, int flags) {
        NfcAdapter nfcAdapter;
        f.f163100a.b("startReading", px.c.a(this));
        p pVar = this.activity;
        if (pVar == null || (nfcAdapter = this.nfcAdapter) == null) {
            return;
        }
        nfcAdapter.enableReaderMode(pVar, readerCallback, flags, bundle);
    }

    @Override // oz.c
    public void e(p activity) {
        f.f163100a.b("connectActivity", px.c.a(this));
        this.activity = activity;
    }

    @Override // s00.d
    public void f(cy.c readerResult) {
        ju.j.b(null, new b(readerResult, this, null), 1, null);
    }

    @Override // cy.a
    public void g() {
        f.f163100a.b("disableReading", px.c.a(this));
        this.edoNfcTagReader.c();
    }

    @Override // cy.a
    public boolean isEnabled() {
        NfcAdapter nfcAdapter = this.nfcAdapter;
        if (nfcAdapter != null) {
            return nfcAdapter.isEnabled();
        }
        return false;
    }

    public boolean j() {
        return this.nfcAdapter != null;
    }

    @Override // cy.a
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a0<cy.c> b() {
        return this.readerResultFlow;
    }
}
