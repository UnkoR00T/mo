package mu;

import java.util.concurrent.CancellationException;
import ju.d2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000124\u0010\u000e\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "Lmu/g;", "Lkotlin/Function3;", "Lmu/h;", "", "Ltq/e;", "Loq/i0;", "", "action", "a", "(Lmu/g;Ler/q;)Lmu/g;", "Lkotlin/Function4;", "", "", "predicate", "e", "(Lmu/g;Ler/r;)Lmu/g;", "collector", "b", "(Lmu/g;Lmu/h;Ltq/e;)Ljava/lang/Object;", "Ltq/i;", "coroutineContext", "c", "(Ljava/lang/Throwable;Ltq/i;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class t {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/t$a", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f128348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.q f128349b;

        /* JADX INFO: renamed from: mu.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C3175a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f128350d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f128351e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f128353g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f128354h;

            public C3175a(tq.e eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128350d = obj;
                this.f128351e |= PKIFailureInfo.systemUnavail;
                return a.this.a(null, this);
            }
        }

        public a(g gVar, er.q qVar) {
            this.f128348a = gVar;
            this.f128349b = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        @Override // mu.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(mu.h<? super T> r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof mu.t.a.C3175a
                if (r0 == 0) goto L13
                r0 = r7
                mu.t$a$a r0 = (mu.t.a.C3175a) r0
                int r1 = r0.f128351e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f128351e = r1
                goto L18
            L13:
                mu.t$a$a r0 = new mu.t$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f128350d
                java.lang.Object r1 = uq.b.e()
                int r2 = r0.f128351e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                oq.u.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f128354h
                mu.h r6 = (mu.h) r6
                java.lang.Object r2 = r0.f128353g
                mu.t$a r2 = (mu.t.a) r2
                oq.u.b(r7)
                goto L53
            L40:
                oq.u.b(r7)
                mu.g r7 = r5.f128348a
                r0.f128353g = r5
                r0.f128354h = r6
                r0.f128351e = r4
                java.lang.Object r7 = mu.i.g(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                er.q r2 = r2.f128349b
                r4 = 0
                r0.f128353g = r4
                r0.f128354h = r4
                r0.f128351e = r3
                r3 = 6
                fr.r.c(r3)
                java.lang.Object r6 = r2.w(r6, r7, r0)
                r7 = 7
                fr.r.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mu.t.a.a(mu.h, tq.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f128355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f128356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f128357f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f128356e = obj;
            this.f128357f |= PKIFailureInfo.systemUnavail;
            return i.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c<T> implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h<T> f128358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fr.p0<Throwable> f128359b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f128360d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f128361e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c<T> f128362f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f128363g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(c<? super T> cVar, tq.e<? super a> eVar) {
                super(eVar);
                this.f128362f = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f128361e = obj;
                this.f128363g |= PKIFailureInfo.systemUnavail;
                return this.f128362f.F(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(h<? super T> hVar, fr.p0<Throwable> p0Var) {
            this.f128358a = hVar;
            this.f128359b = p0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // mu.h
        public final Object F(T t15, tq.e<? super oq.i0> eVar) throws Throwable {
            a aVar;
            c<T> cVar;
            if (eVar instanceof a) {
                aVar = (a) eVar;
                int i15 = aVar.f128363g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    aVar.f128363g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    aVar = new a(this, eVar);
                }
            } else {
                aVar = new a(this, eVar);
            }
            Object obj = aVar.f128361e;
            Object objE = uq.b.e();
            int i16 = aVar.f128363g;
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (c) aVar.f128360d;
                try {
                    oq.u.b(obj);
                    return oq.i0.f148189a;
                } catch (Throwable 
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                    	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                    	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:320)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:297)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    */
                /*
                    this = this;
                    boolean r0 = r6 instanceof mu.t.c.a
                    if (r0 == 0) goto L13
                    r0 = r6
                    mu.t$c$a r0 = (mu.t.c.a) r0
                    int r1 = r0.f128363g
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128363g = r1
                    goto L18
                L13:
                    mu.t$c$a r0 = new mu.t$c$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f128361e
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f128363g
                    r3 = 1
                    if (r2 == 0) goto L37
                    if (r2 != r3) goto L2f
                    java.lang.Object r5 = r0.f128360d
                    mu.t$c r5 = (mu.t.c) r5
                    oq.u.b(r6)     // Catch: java.lang.Throwable -> L2d
                    goto L47
                L2d:
                    r6 = move-exception
                    goto L4c
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L37:
                    oq.u.b(r6)
                    mu.h<T> r6 = r4.f128358a     // Catch: java.lang.Throwable -> L4a
                    r0.f128360d = r4     // Catch: java.lang.Throwable -> L4a
                    r0.f128363g = r3     // Catch: java.lang.Throwable -> L4a
                    java.lang.Object r5 = r6.F(r5, r0)     // Catch: java.lang.Throwable -> L4a
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    oq.i0 r5 = oq.i0.f148189a
                    return r5
                L4a:
                    r6 = move-exception
                    r5 = r4
                L4c:
                    fr.p0<java.lang.Throwable> r5 = r5.f128359b
                    r5.f66410a = r6
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.t.c.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"mu/t$d", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d<T> implements g<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f128364a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.r f128365b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f128366d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f128367e;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f128369g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f128370h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f128371j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                long f128372k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f128373l;

                public a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f128366d = obj;
                    this.f128367e |= PKIFailureInfo.systemUnavail;
                    return d.this.a(null, this);
                }
            }

            public d(g gVar, er.r rVar) {
                this.f128364a = gVar;
                this.f128365b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:20:0x006f  */
            /* JADX WARN: Code duplicated, block: B:23:0x0078  */
            /* JADX WARN: Code duplicated, block: B:26:0x0097  */
            /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[PHI: r2 r5 r7 r12
              0x00a6: PHI (r2v5 mu.h<? super T>) = (r2v1 mu.h<? super T>), (r2v6 mu.h<? super T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r5v3 long) = (r5v1 long), (r5v5 long) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r7v4 mu.t$d<T>) = (r7v0 mu.t$d<T>), (r7v5 mu.t$d<T>) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]
              0x00a6: PHI (r12v7 int) = (r12v1 int), (r12v12 int) binds: [B:22:0x0076, B:29:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:35:0x00ae  */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // mu.g
            public java.lang.Object a(mu.h<? super T> r12, tq.e<? super oq.i0> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof mu.t.d.a
                    if (r0 == 0) goto L13
                    r0 = r13
                    mu.t$d$a r0 = (mu.t.d.a) r0
                    int r1 = r0.f128367e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f128367e = r1
                    goto L18
                L13:
                    mu.t$d$a r0 = new mu.t$d$a
                    r0.<init>(r13)
                L18:
                    java.lang.Object r13 = r0.f128366d
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f128367e
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L52
                    if (r2 == r4) goto L42
                    if (r2 != r3) goto L3a
                    long r5 = r0.f128372k
                    java.lang.Object r12 = r0.f128371j
                    java.lang.Throwable r12 = (java.lang.Throwable) r12
                    java.lang.Object r2 = r0.f128370h
                    mu.h r2 = (mu.h) r2
                    java.lang.Object r7 = r0.f128369g
                    mu.t$d r7 = (mu.t.d) r7
                    oq.u.b(r13)
                    goto L9a
                L3a:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L42:
                    int r12 = r0.f128373l
                    long r5 = r0.f128372k
                    java.lang.Object r2 = r0.f128370h
                    mu.h r2 = (mu.h) r2
                    java.lang.Object r7 = r0.f128369g
                    mu.t$d r7 = (mu.t.d) r7
                    oq.u.b(r13)
                    goto L74
                L52:
                    oq.u.b(r13)
                    r5 = 0
                    r13 = r11
                L58:
                    mu.g r2 = r13.f128364a
                    r0.f128369g = r13
                    r0.f128370h = r12
                    r7 = 0
                    r0.f128371j = r7
                    r0.f128372k = r5
                    r7 = 0
                    r0.f128373l = r7
                    r0.f128367e = r4
                    java.lang.Object r2 = mu.i.g(r2, r12, r0)
                    if (r2 != r1) goto L6f
                    goto L96
                L6f:
                    r10 = r2
                    r2 = r12
                    r12 = r7
                    r7 = r13
                    r13 = r10
                L74:
                    java.lang.Throwable r13 = (java.lang.Throwable) r13
                    if (r13 == 0) goto La6
                    er.r r12 = r7.f128365b
                    java.lang.Long r8 = vq.b.f(r5)
                    r0.f128369g = r7
                    r0.f128370h = r2
                    r0.f128371j = r13
                    r0.f128372k = r5
                    r0.f128367e = r3
                    r9 = 6
                    fr.r.c(r9)
                    java.lang.Object r12 = r12.g(r2, r13, r8, r0)
                    r8 = 7
                    fr.r.c(r8)
                    if (r12 != r1) goto L97
                L96:
                    return r1
                L97:
                    r10 = r13
                    r13 = r12
                    r12 = r10
                L9a:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    boolean r13 = r13.booleanValue()
                    if (r13 == 0) goto La8
                    r12 = 1
                    long r5 = r5 + r12
                    r12 = r4
                La6:
                    r13 = r7
                    goto La9
                La8:
                    throw r12
                La9:
                    if (r12 != 0) goto Lae
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                Lae:
                    r12 = r2
                    goto L58
                */
                throw new UnsupportedOperationException("Method not decompiled: mu.t.d.a(mu.h, tq.e):java.lang.Object");
            }
        }

        public static final <T> g<T> a(g<? extends T> gVar, er.q<? super h<? super T>, ? super Throwable, ? super tq.e<? super oq.i0>, ? extends Object> qVar) {
            return new a(gVar, qVar);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final <T> Object b(g<? extends T> gVar, h<? super T> hVar, tq.e<? super Throwable> eVar) throws Throwable {
            b bVar;
            fr.p0 p0Var;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f128357f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f128357f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f128356e;
            Object objE = uq.b.e();
            int i16 = bVar.f128357f;
            if (i16 == 0) {
                oq.u.b(obj);
                fr.p0 p0Var2 = new fr.p0();
                try {
                    h<? super Object> cVar = new c<>(hVar, p0Var2);
                    bVar.f128355d = p0Var2;
                    bVar.f128357f = 1;
                    if (gVar.a(cVar, bVar) == objE) {
                        return objE;
                    }
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    p0Var = p0Var2;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (fr.p0) bVar.f128355d;
                try {
                    oq.u.b(obj);
                    return null;
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            Throwable th6 = (Throwable) p0Var.f66410a;
            if (d(th, th6) || c(th, bVar.getContext())) {
                throw th;
            }
            if (th6 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                oq.c.a(th6, th);
                throw th6;
            }
            oq.c.a(th, th6);
            throw th;
        }

        private static final boolean c(Throwable th4, tq.i iVar) {
            d2 d2Var = (d2) iVar.m(d2.INSTANCE);
            if (d2Var == null || !d2Var.isCancelled()) {
                return false;
            }
            return d(th4, d2Var.N());
        }

        private static final boolean d(Throwable th4, Throwable th5) {
            return th5 != null && fr.t.c(th5, th4);
        }

        public static final <T> g<T> e(g<? extends T> gVar, er.r<? super h<? super T>, ? super Throwable, ? super Long, ? super tq.e<? super Boolean>, ? extends Object> rVar) {
            return new d(gVar, rVar);
        }
    }
