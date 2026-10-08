package u6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lu6/h;", "T", "", "a", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u6.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lu6/h$a;", "", "<init>", "()V", "T", "", "Lu6/g;", "migrations", "Lu6/c0;", "api", "Loq/i0;", "c", "(Ljava/util/List;Lu6/c0;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function2;", "Ltq/e;", "b", "(Ljava/util/List;)Ler/p;", "datastore-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: u6.h$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu6/c0;", "api", "Loq/i0;", "<anonymous>", "(Lu6/c0;)V"}, k = 3, mv = {2, 0, 0})
        static final class C5090a extends vq.k implements er.p<c0<T>, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f195537e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f195538f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<g<T>> f195539g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C5090a(List<? extends g<T>> list, tq.e<? super C5090a> eVar) {
                super(2, eVar);
                this.f195539g = list;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f195537e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    c0 c0Var = (c0) this.f195538f;
                    Companion companion = h.INSTANCE;
                    List<g<T>> list = this.f195539g;
                    this.f195537e = 1;
                    if (companion.c(list, c0Var, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(c0<T> c0Var, tq.e<? super oq.i0> eVar) {
                return ((C5090a) v(c0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                C5090a c5090a = new C5090a(this.f195539g, eVar);
                c5090a.f195538f = obj;
                return c5090a;
            }
        }

        /* JADX INFO: renamed from: u6.h$a$b */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class b<T> extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f195540d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f195541e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f195542f;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f195544h;

            b(tq.e<? super b> eVar) {
                super(eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f195542f = obj;
                this.f195544h |= PKIFailureInfo.systemUnavail;
                return Companion.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: u6.h$a$c */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class c extends vq.k implements er.p<T, tq.e<? super T>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f195545e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f195546f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f195547g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f195548h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f195549j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ List<g<T>> f195550k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ List<er.l<tq.e<? super oq.i0>, Object>> f195551l;

            /* JADX INFO: renamed from: u6.h$a$c$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 0, 0})
            static final class C5091a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f195552e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ g<T> f195553f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C5091a(g<T> gVar, tq.e<? super C5091a> eVar) {
                    super(1, eVar);
                    this.f195553f = gVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f195552e;
                    if (i15 == 0) {
                        oq.u.b(obj);
                        g<T> gVar = this.f195553f;
                        this.f195552e = 1;
                        if (gVar.c(this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i15 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(obj);
                    }
                    return oq.i0.f148189a;
                }

                public final tq.e<oq.i0> M(tq.e<?> eVar) {
                    return new C5091a(this.f195553f, eVar);
                }

                @Override // er.l
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object b(tq.e<? super oq.i0> eVar) {
                    return ((C5091a) M(eVar)).J(oq.i0.f148189a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends g<T>> list, List<er.l<tq.e<? super oq.i0>, Object>> list2, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f195550k = list;
                this.f195551l = list2;
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004c  */
            /* JADX WARN: Code duplicated, block: B:16:0x0063  */
            /* JADX WARN: Code duplicated, block: B:19:0x0070  */
            /* JADX WARN: Code duplicated, block: B:22:0x008a  */
            /* JADX WARN: Code duplicated, block: B:23:0x008c  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // vq.a
            public final java.lang.Object J(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r9.f195548h
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f195545e
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f195549j
                    java.util.List r4 = (java.util.List) r4
                    oq.u.b(r10)
                    goto L46
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f195547g
                    java.lang.Object r4 = r9.f195546f
                    u6.g r4 = (u6.g) r4
                    java.lang.Object r5 = r9.f195545e
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f195549j
                    java.util.List r6 = (java.util.List) r6
                    oq.u.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L68
                L37:
                    oq.u.b(r10)
                    java.lang.Object r10 = r9.f195549j
                    java.util.List<u6.g<T>> r1 = r9.f195550k
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<er.l<tq.e<? super oq.i0>, java.lang.Object>> r4 = r9.f195551l
                    java.util.Iterator r1 = r1.iterator()
                L46:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8e
                    java.lang.Object r5 = r1.next()
                    u6.g r5 = (u6.g) r5
                    r9.f195549j = r4
                    r9.f195545e = r1
                    r9.f195546f = r5
                    r9.f195547g = r10
                    r9.f195548h = r3
                    java.lang.Object r6 = r5.b(r10, r9)
                    if (r6 != r0) goto L63
                    goto L89
                L63:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L68:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8c
                    u6.h$a$c$a r10 = new u6.h$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f195549j = r4
                    r9.f195545e = r5
                    r9.f195546f = r7
                    r9.f195547g = r7
                    r9.f195548h = r2
                    java.lang.Object r10 = r6.a(r1, r9)
                    if (r10 != r0) goto L8a
                L89:
                    return r0
                L8a:
                    r1 = r5
                    goto L46
                L8c:
                    r10 = r1
                    goto L8a
                L8e:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.h.Companion.c.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(T t15, tq.e<? super T> eVar) {
                return ((c) v(t15, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                c cVar = new c(this.f195550k, this.f195551l, eVar);
                cVar.f195549j = obj;
                return cVar;
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x0071  */
        /* JADX WARN: Code duplicated, block: B:37:0x0097  */
        /* JADX WARN: Code duplicated, block: B:39:0x009a  */
        /* JADX WARN: Code duplicated, block: B:43:0x0083 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x006b->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        public final <T> Object c(List<? extends g<T>> list, c0<T> c0Var, tq.e<? super oq.i0> eVar) throws Throwable {
            b bVar;
            List list2;
            fr.p0 p0Var;
            Iterator<T> it;
            Throwable th4;
            er.l lVar;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f195544h;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f195544h = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(eVar);
                }
            } else {
                bVar = new b(eVar);
            }
            Object obj = bVar.f195542f;
            Object objE = uq.b.e();
            int i16 = bVar.f195544h;
            if (i16 == 0) {
                oq.u.b(obj);
                ArrayList arrayList = new ArrayList();
                er.p<? super T, ? super tq.e<? super T>, ? extends Object> cVar = new c(list, arrayList, null);
                bVar.f195540d = arrayList;
                bVar.f195544h = 1;
                if (c0Var.a(cVar, bVar) != objE) {
                    list2 = arrayList;
                }
                return objE;
            }
            if (i16 == 1) {
                list2 = (List) bVar.f195540d;
                oq.u.b(obj);
            } else {
                if (i16 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f195541e;
                p0Var = (fr.p0) bVar.f195540d;
                try {
                    oq.u.b(obj);
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
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
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
                    boolean r0 = r9 instanceof u6.h.Companion.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    u6.h$a$b r0 = (u6.h.Companion.b) r0
                    int r1 = r0.f195544h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f195544h = r1
                    goto L18
                L13:
                    u6.h$a$b r0 = new u6.h$a$b
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f195542f
                    java.lang.Object r1 = uq.b.e()
                    int r2 = r0.f195544h
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L46
                    if (r2 == r4) goto L3e
                    if (r2 != r3) goto L36
                    java.lang.Object r7 = r0.f195541e
                    java.util.Iterator r7 = (java.util.Iterator) r7
                    java.lang.Object r8 = r0.f195540d
                    fr.p0 r8 = (fr.p0) r8
                    oq.u.b(r9)     // Catch: java.lang.Throwable -> L34
                    goto L6b
                L34:
                    r9 = move-exception
                    goto L84
                L36:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3e:
                    java.lang.Object r7 = r0.f195540d
                    java.util.List r7 = (java.util.List) r7
                    oq.u.b(r9)
                    goto L60
                L46:
                    oq.u.b(r9)
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    u6.h$a$c r2 = new u6.h$a$c
                    r5 = 0
                    r2.<init>(r7, r9, r5)
                    r0.f195540d = r9
                    r0.f195544h = r4
                    java.lang.Object r7 = r8.a(r2, r0)
                    if (r7 != r1) goto L5f
                    goto L83
                L5f:
                    r7 = r9
                L60:
                    fr.p0 r8 = new fr.p0
                    r8.<init>()
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L6b:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L91
                    java.lang.Object r9 = r7.next()
                    er.l r9 = (er.l) r9
                    r0.f195540d = r8     // Catch: java.lang.Throwable -> L34
                    r0.f195541e = r7     // Catch: java.lang.Throwable -> L34
                    r0.f195544h = r3     // Catch: java.lang.Throwable -> L34
                    java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L34
                    if (r9 != r1) goto L6b
                L83:
                    return r1
                L84:
                    T r2 = r8.f66410a
                    if (r2 != 0) goto L8b
                    r8.f66410a = r9
                    goto L6b
                L8b:
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    oq.c.a(r2, r9)
                    goto L6b
                L91:
                    T r7 = r8.f66410a
                    java.lang.Throwable r7 = (java.lang.Throwable) r7
                    if (r7 != 0) goto L9a
                    oq.i0 r7 = oq.i0.f148189a
                    return r7
                L9a:
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: u6.h.Companion.c(java.util.List, u6.c0, tq.e):java.lang.Object");
            }

            public final <T> er.p<c0<T>, tq.e<? super oq.i0>, Object> b(List<? extends g<T>> migrations) {
                return new C5090a(migrations, null);
            }

            private Companion() {
            }
        }
    }
