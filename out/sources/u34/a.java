package u34;

import dx.i;
import dx.j;
import fr0.DocumentConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ'\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00110\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lu34/a;", "Lz34/a;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/a;", "storage", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/storage/a;)V", "", "Lfr0/g;", "configs", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "c", "(Ltq/e;)Ljava/lang/Object;", "b", "Lmu/g;", "a", "()Ldx/i;", "Lpl/gov/coi/mobywatel/technical/documents/data/storage/a;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements z34.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.documents.data.storage.a storage;

    /* JADX INFO: renamed from: u34.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5079a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f195007d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195008e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195009f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195010g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195011h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195012j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195013k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195014l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f195015m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195017p;

        C5079a(tq.e<? super C5079a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195015m = obj;
            this.f195017p |= PKIFailureInfo.systemUnavail;
            return a.this.b(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f195018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f195019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f195020f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f195021g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195022h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f195023j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f195024k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f195025l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f195026m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f195028p;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195026m = obj;
            this.f195028p |= PKIFailureInfo.systemUnavail;
            return a.this.c(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f195029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f195030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f195031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f195032g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f195033h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f195034j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f195035k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f195036l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f195037m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f195038n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f195040q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f195038n = obj;
            this.f195040q |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(pl.gov.coi.mobywatel.technical.documents.data.storage.a aVar) {
        this.storage = aVar;
    }

    @Override // z34.a
    public i<dx.b, mu.g<List<DocumentConfig>>> a() {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(this.storage.a());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tq.e, u34.a$a] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [pl.gov.coi.mobywatel.technical.documents.data.storage.a] */
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
    @Override // z34.a
    public Object b(tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        ?? c5079a;
        Object objB;
        ex.c e15;
        if (eVar instanceof C5079a) {
            C5079a c5079a2 = (C5079a) eVar;
            int i15 = c5079a2.f195017p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c5079a2.f195017p = i15 - PKIFailureInfo.systemUnavail;
                c5079a = c5079a2;
            } else {
                c5079a = new C5079a(eVar);
            }
        } else {
            c5079a = new C5079a(eVar);
        }
        Object obj = c5079a.f195015m;
        Object objE = uq.b.e();
        int i16 = c5079a.f195017p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? r15 = this.storage;
                        c5079a.f195012j = jVarA;
                        c5079a.f195013k = vq.j.a(aVar);
                        c5079a.f195014l = vq.j.a(aVar);
                        c5079a.f195007d = 0;
                        c5079a.f195008e = 0;
                        c5079a.f195009f = 0;
                        c5079a.f195010g = 0;
                        c5079a.f195011h = 0;
                        c5079a.f195017p = 1;
                        if (r15.b(c5079a) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        c5079a = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(c5079a));
                        i iVarA = c5079a.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [tq.e, u34.a$b] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [pl.gov.coi.mobywatel.technical.documents.data.storage.a] */
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
    @Override // z34.a
    public Object c(tq.e<? super i<? extends dx.b, ? extends List<DocumentConfig>>> eVar) throws Throwable {
        ?? bVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof b) {
            b bVar2 = (b) eVar;
            int i15 = bVar2.f195028p;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar2.f195028p = i15 - PKIFailureInfo.systemUnavail;
                bVar = bVar2;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f195026m;
        Object objE = uq.b.e();
        int i16 = bVar.f195028p;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        ?? r15 = this.storage;
                        bVar.f195023j = jVarA;
                        bVar.f195024k = vq.j.a(aVar);
                        bVar.f195025l = vq.j.a(aVar);
                        bVar.f195018d = 0;
                        bVar.f195019e = 0;
                        bVar.f195020f = 0;
                        bVar.f195021g = 0;
                        bVar.f195022h = 0;
                        bVar.f195028p = 1;
                        Object objD = r15.d(bVar);
                        if (objD == objE) {
                            return objE;
                        }
                        obj = objD;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        bVar = jVarA;
                        e = e18;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(bVar));
                        i iVarA = bVar.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right((List) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List, java.util.List<fr0.g>] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // z34.a
    public Object d(List<DocumentConfig> list, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f195040q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f195040q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f195038n;
        Object objE = uq.b.e();
        int i16 = cVar.f195040q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar = new ex.a();
                        pl.gov.coi.mobywatel.technical.documents.data.storage.a aVar2 = this.storage;
                        cVar.f195029d = vq.j.a(list);
                        cVar.f195030e = jVarA;
                        cVar.f195031f = vq.j.a(aVar);
                        cVar.f195032g = vq.j.a(aVar);
                        cVar.f195033h = 0;
                        cVar.f195034j = 0;
                        cVar.f195035k = 0;
                        cVar.f195036l = 0;
                        cVar.f195037m = 0;
                        cVar.f195040q = 1;
                        if (aVar2.c(list, cVar) == objE) {
                            return objE;
                        }
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        list = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(list));
                        i iVarA = list.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new i.Right(i0.f148189a);
            } catch (Exception e26) {
                e = e26;
            }
        } catch (CancellationException e27) {
            throw e27;
        }
    }
}
