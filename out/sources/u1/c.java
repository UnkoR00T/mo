package u1;

import er.p;
import er.s;
import oq.i0;
import oq.u;
import p036e4.b0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import w0.b2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB-\u0012$\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R2\u0010\b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R7\u0010 \u001a\b\u0018\u00010\u0018R\u00020\u00002\f\u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lu1/c;", "Lu1/k;", "Lkotlin/Function3;", "Lq1/g;", "Lu1/j;", "Lkotlin/Function0;", "Le4/b0;", "Loq/i0;", "contextMenuBlock", "<init>", "(Ler/s;)V", "dataProvider", "a", "(Lu1/j;Ltq/e;)Ljava/lang/Object;", "anchorLayoutCoordinates", "d", "(Ler/a;Lm2/r;I)V", "h", "()V", "Ler/s;", "Lw0/b2;", "b", "Lw0/b2;", "mutatorMutex", "Lu1/c$a;", "<set-?>", "c", "Lm2/a3;", "i", "()Lu1/c$a;", "j", "(Lu1/c$a;)V", "session", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s<q1.g, j, er.a<? extends b0>, r, Integer, i0> contextMenuBlock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b2 mutatorMutex = new b2();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 session = c6.e(null, null, 2, null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lu1/c$a;", "Lq1/g;", "Lu1/j;", "dataProvider", "<init>", "(Lu1/c;Lu1/j;)V", "Loq/i0;", "close", "()V", "a", "(Ltq/e;)Ljava/lang/Object;", "Lu1/j;", "b", "()Lu1/j;", "Llu/g;", "Llu/g;", "channel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements q1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final j dataProvider;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final lu.g<i0> channel = lu.j.b(0, null, null, 7, null);

        public a(j jVar) {
            this.dataProvider = jVar;
        }

        public final Object a(tq.e<? super i0> eVar) {
            Object objA = this.channel.a(eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j getDataProvider() {
            return this.dataProvider;
        }

        @Override // q1.g
        public void close() {
            this.channel.d(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f194086e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a f194088g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f194088g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f194086e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    c.this.j(this.f194088g);
                    a aVar = this.f194088g;
                    this.f194086e = 1;
                    if (aVar.a(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                c.this.j(null);
                return i0.f148189a;
            } catch (Throwable th4) {
                c.this.j(null);
                throw th4;
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new b(this.f194088g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(s<? super q1.g, ? super j, ? super er.a<? extends b0>, ? super r, ? super Integer, i0> sVar) {
        this.contextMenuBlock = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(c cVar, er.a aVar, int i15, r rVar, int i16) {
        cVar.d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(c cVar, er.a aVar, int i15, r rVar, int i16) {
        cVar.d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a i() {
        return (a) this.session.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(a aVar) {
        this.session.setValue(aVar);
    }

    @Override // u1.k
    public Object a(j jVar, tq.e<? super i0> eVar) {
        Object objE = b2.e(this.mutatorMutex, null, new b(new a(jVar), null), eVar, 1, null);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    public final void d(final er.a<? extends b0> aVar, r rVar, final int i15) {
        int i16;
        final er.a<? extends b0> aVar2;
        r rVarH = rVar.h(723898654);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(this) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(723898654, i16, -1, "androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider.ContextMenu (BasicTextContextMenuProvider.kt:137)");
            }
            a aVarI = i();
            if (aVarI == null) {
                if (t.k()) {
                    t.n();
                }
                d5 d5VarM = rVarH.m();
                if (d5VarM != null) {
                    d5VarM.a(new p() { // from class: u1.a
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return c.e(this.f194074a, aVar, i15, (r) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.contextMenuBlock.C(aVarI, aVarI.getDataProvider(), aVar2, rVarH, Integer.valueOf((i16 << 6) & 896));
            if (t.k()) {
                t.n();
            }
        } else {
            aVar2 = aVar;
            rVarH.O();
        }
        d5 d5VarM2 = rVarH.m();
        if (d5VarM2 != null) {
            d5VarM2.a(new p() { // from class: u1.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.f(this.f194077a, aVar2, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void h() {
        a aVarI = i();
        if (aVarI != null) {
            aVarI.close();
        }
    }
}
