package pc4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.ProcessId;
import yd3.PersonalAddressContainer;
import yd3.PersonalDataContainer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpc4/l9;", "", "<init>", "()V", "Ljr0/l;", "Lyd3/e;", "g", "(Ljr0/l;)Lyd3/e;", "Ljr0/k;", "Lyd3/d;", "e", "(Ljr0/k;)Lyd3/d;", "Li24/g0;", "f", "(Li24/g0;)Lyd3/e;", "Li24/f0;", "d", "(Li24/f0;)Lyd3/d;", "Lc54/b;", "isFeatureEnabledUseCase", "Lk24/e;", "getMIdCardDataUC", "Lq34/w0;", "getMIdCardDataUseCase", "Lp34/a;", "documentsRepository", "Lvd3/a;", "c", "(Lc54/b;Lk24/e;Lq34/w0;Lp34/a;)Lvd3/a;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l9 f155171a = new l9();

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0096@¢\u0006\u0004\b\b\u0010\tJ\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0005H\u0096@¢\u0006\u0004\b\f\u0010\tJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\r\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J,\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"pc4/l9$a", "Lvd3/a;", "", "a", "()Z", "Ldx/i;", "Ldx/b;", "Lyd3/e;", "e", "(Ltq/e;)Ljava/lang/Object;", "", "Lsv0/y;", "b", "processId", "", "c", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "d", "savedDraftCollision", "f", "(Lsv0/y;[BLtq/e;)Ljava/lang/Object;", "mObywatel_prodRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements vd3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c54.b f155172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k24.e f155173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q34.w0 f155174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p34.a f155175d;

        /* JADX INFO: renamed from: pc4.l9$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3847a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f155176d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f155177e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155178f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f155179g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f155180h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155181j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f155182k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f155183l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f155184m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            /* synthetic */ Object f155185n;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f155187q;

            C3847a(tq.e<? super C3847a> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155185n = obj;
                this.f155187q |= PKIFailureInfo.systemUnavail;
                return a.this.b(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155188d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155189e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155190f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155191g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155192h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155193j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155194k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155195l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155196m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155197n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155198p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155200r;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155198p = obj;
                this.f155200r |= PKIFailureInfo.systemUnavail;
                return a.this.c(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f155201d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f155203f;

            c(tq.e<? super c> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155201d = obj;
                this.f155203f |= PKIFailureInfo.systemUnavail;
                return a.this.e(this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class d extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155204d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155205e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155206f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155207g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155208h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f155209j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155210k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155211l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155212m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155213n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f155214p;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f155216r;

            d(tq.e<? super d> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155214p = obj;
                this.f155216r |= PKIFailureInfo.systemUnavail;
                return a.this.d(null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class e extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f155217d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f155218e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f155219f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f155220g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f155221h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f155222j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f155223k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f155224l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f155225m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f155226n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f155227p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            /* synthetic */ Object f155228q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f155230s;

            e(tq.e<? super e> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f155228q = obj;
                this.f155230s |= PKIFailureInfo.systemUnavail;
                return a.this.f(null, null, this);
            }
        }

        a(c54.b bVar, k24.e eVar, q34.w0 w0Var, p34.a aVar) {
            this.f155172a = bVar;
            this.f155173b = eVar;
            this.f155174c = w0Var;
            this.f155175d = aVar;
        }

        @Override // vd3.a
        public boolean a() {
            return this.f155172a.a(b54.c.MOB_DB_CONTAINERS).booleanValue();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [pc4.l9$a$a, tq.e] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v4, types: [p34.a] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // vd3.a
        public Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<ProcessId>>> eVar) throws Throwable {
            ?? c3847a;
            Object objB;
            ex.b bVar;
            if (eVar instanceof C3847a) {
                C3847a c3847a2 = (C3847a) eVar;
                int i15 = c3847a2.f155187q;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c3847a2.f155187q = i15 - PKIFailureInfo.systemUnavail;
                    c3847a = c3847a2;
                } else {
                    c3847a = new C3847a(eVar);
                }
            } else {
                c3847a = new C3847a(eVar);
            }
            Object objB2 = c3847a.f155185n;
            Object objE = uq.b.e();
            int i16 = c3847a.f155187q;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objB2);
                        c54.b bVar2 = this.f155172a;
                        ?? r15 = this.f155175d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar = new ex.a();
                            if (bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                                aVar.b(new dx.b.Generic(new UnsupportedOperationException("Wrong getting all drafts data method")));
                                throw new oq.g();
                            }
                            c3847a.f155181j = jVarA;
                            c3847a.f155182k = vq.j.a(aVar);
                            c3847a.f155183l = vq.j.a(aVar);
                            c3847a.f155184m = aVar;
                            c3847a.f155176d = 0;
                            c3847a.f155177e = 0;
                            c3847a.f155178f = 0;
                            c3847a.f155179g = 0;
                            c3847a.f155180h = 0;
                            c3847a.f155187q = 1;
                            objB2 = r15.b(c3847a);
                            if (objB2 == objE) {
                                return objE;
                            }
                            bVar = aVar;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            c3847a = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(c3847a));
                            dx.i iVarA = c3847a.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) c3847a.f155184m;
                        try {
                            oq.u.b(objB2);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    Iterable iterable = (Iterable) bVar.a((dx.i) objB2);
                    ArrayList arrayList = new ArrayList(pq.v.y(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ProcessId((String) it.next()));
                    }
                    return new dx.i.Right(arrayList);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // vd3.a
        public Object c(ProcessId processId, tq.e<? super dx.i<? extends dx.b, byte[]>> eVar) throws Throwable {
            b bVar;
            Object objB;
            ex.b bVar2;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f155200r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f155200r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object objM = bVar.f155198p;
            ?? E = uq.b.e();
            int i16 = bVar.f155200r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objM);
                        c54.b bVar3 = this.f155172a;
                        p34.a aVar = this.f155175d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            if (bVar3.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                                aVar2.b(new dx.b.Generic(new UnsupportedOperationException("Wrong getting draft data method")));
                                throw new oq.g();
                            }
                            String processId2 = processId.getProcessId();
                            bVar.f155188d = vq.j.a(processId);
                            bVar.f155189e = jVarA;
                            bVar.f155190f = vq.j.a(aVar2);
                            bVar.f155191g = vq.j.a(aVar2);
                            bVar.f155192h = aVar2;
                            bVar.f155193j = 0;
                            bVar.f155194k = 0;
                            bVar.f155195l = 0;
                            bVar.f155196m = 0;
                            bVar.f155197n = 0;
                            bVar.f155200r = 1;
                            objM = aVar.m(processId2, bVar);
                            if (objM == E) {
                                return E;
                            }
                            bVar2 = aVar2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (ex.b) bVar.f155192h;
                        try {
                            oq.u.b(objM);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new dx.i.Right((byte[]) bVar2.a((dx.i) objM));
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2 */
        @Override // vd3.a
        public Object d(ProcessId processId, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            d dVar;
            Object objB;
            ex.b bVar;
            if (eVar instanceof d) {
                dVar = (d) eVar;
                int i15 = dVar.f155216r;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    dVar.f155216r = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    dVar = new d(eVar);
                }
            } else {
                dVar = new d(eVar);
            }
            Object objQ = dVar.f155214p;
            ?? E = uq.b.e();
            int i16 = dVar.f155216r;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objQ);
                        c54.b bVar2 = this.f155172a;
                        p34.a aVar = this.f155175d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            if (bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                                aVar2.b(new dx.b.Generic(new UnsupportedOperationException("Wrong removing draft data method")));
                                throw new oq.g();
                            }
                            String processId2 = processId.getProcessId();
                            dVar.f155204d = vq.j.a(processId);
                            dVar.f155205e = jVarA;
                            dVar.f155206f = vq.j.a(aVar2);
                            dVar.f155207g = vq.j.a(aVar2);
                            dVar.f155208h = aVar2;
                            dVar.f155209j = 0;
                            dVar.f155210k = 0;
                            dVar.f155211l = 0;
                            dVar.f155212m = 0;
                            dVar.f155213n = 0;
                            dVar.f155216r = 1;
                            objQ = aVar.q(processId2, dVar);
                            if (objQ == E) {
                                return E;
                            }
                            bVar = aVar2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            dx.i iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) dVar.f155208h;
                        try {
                            oq.u.b(objQ);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    bVar.a((dx.i) objQ);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (Exception e25) {
                    e = e25;
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
        
            if (r6 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        
            if (r6 == r1) goto L33;
         */
        @Override // vd3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object e(tq.e<? super dx.i<? extends dx.b, yd3.PersonalDataContainer>> r6) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pc4.l9.a.e(tq.e):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0, types: [byte[], java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // vd3.a
        public Object f(ProcessId processId, byte[] bArr, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
            e eVar2;
            Object objB;
            ex.b bVar;
            if (eVar instanceof e) {
                eVar2 = (e) eVar;
                int i15 = eVar2.f155230s;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    eVar2.f155230s = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    eVar2 = new e(eVar);
                }
            } else {
                eVar2 = new e(eVar);
            }
            Object objH = eVar2.f155228q;
            Object objE = uq.b.e();
            int i16 = eVar2.f155230s;
            try {
                try {
                    if (i16 == 0) {
                        oq.u.b(objH);
                        c54.b bVar2 = this.f155172a;
                        p34.a aVar = this.f155175d;
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            ex.a aVar2 = new ex.a();
                            if (bVar2.a(b54.c.MOB_DB_CONTAINERS).booleanValue()) {
                                aVar2.b(new dx.b.Generic(new UnsupportedOperationException("Wrong saving draft data method")));
                                throw new oq.g();
                            }
                            String processId2 = processId.getProcessId();
                            eVar2.f155217d = vq.j.a(processId);
                            eVar2.f155218e = vq.j.a(bArr);
                            eVar2.f155219f = jVarA;
                            eVar2.f155220g = vq.j.a(aVar2);
                            eVar2.f155221h = vq.j.a(aVar2);
                            eVar2.f155222j = aVar2;
                            eVar2.f155223k = 0;
                            eVar2.f155224l = 0;
                            eVar2.f155225m = 0;
                            eVar2.f155226n = 0;
                            eVar2.f155227p = 0;
                            eVar2.f155230s = 1;
                            objH = aVar.H(processId2, bArr, eVar2);
                            if (objH == objE) {
                                return objE;
                            }
                            bVar = aVar2;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            bArr = jVarA;
                            px.f fVar = px.f.f163100a;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(bArr));
                            dx.i iVarA = bArr.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar = (ex.b) eVar2.f155222j;
                        try {
                            oq.u.b(objH);
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    bVar.a((dx.i) objH);
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e25) {
                    throw e25;
                }
            } catch (Exception e26) {
                e = e26;
            }
        }
    }

    private l9() {
    }

    private final PersonalAddressContainer d(i24.PersonalAddressContainer personalAddressContainer) {
        return new PersonalAddressContainer(personalAddressContainer.getStreetName(), personalAddressContainer.getHouseNumber(), personalAddressContainer.getPostalCode(), personalAddressContainer.getMunicipality(), personalAddressContainer.getApartmentNumber());
    }

    private final PersonalAddressContainer e(jr0.PersonalAddressContainer personalAddressContainer) {
        return new PersonalAddressContainer(personalAddressContainer.getStreetName(), personalAddressContainer.getHouseNumber(), personalAddressContainer.getPostalCode(), personalAddressContainer.getMunicipality(), personalAddressContainer.getApartmentNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalDataContainer f(i24.PersonalDataContainer personalDataContainer) {
        iy.b0 name = personalDataContainer.getName();
        iy.b0 familyName = personalDataContainer.getFamilyName();
        i24.PersonalAddressContainer permanentAddress = personalDataContainer.getPermanentAddress();
        return new PersonalDataContainer(name, familyName, permanentAddress != null ? d(permanentAddress) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonalDataContainer g(jr0.PersonalDataContainer personalDataContainer) {
        iy.b0 name = personalDataContainer.getName();
        iy.b0 familyName = personalDataContainer.getFamilyName();
        jr0.PersonalAddressContainer permanentAddress = personalDataContainer.getPermanentAddress();
        return new PersonalDataContainer(name, familyName, permanentAddress != null ? e(permanentAddress) : null);
    }

    public final vd3.a c(c54.b isFeatureEnabledUseCase, k24.e getMIdCardDataUC, q34.w0 getMIdCardDataUseCase, p34.a documentsRepository) {
        return new a(isFeatureEnabledUseCase, getMIdCardDataUC, getMIdCardDataUseCase, documentsRepository);
    }
}
