package pr;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0002g,B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u00104\u001a\u0012\u0012\u000e\u0012\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00000.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003050\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u0002090\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00107R\u0016\u0010=\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010)R\u0016\u0010?\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010)R\u0016\u0010B\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\"\u0010I\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020 8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010KR\u0014\u0010Q\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020X8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\\8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^R\u0014\u0010e\u001a\u00020b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lpr/f0;", "", "T", "Lpr/g1;", "Lmr/c;", "Lpr/b1;", "Lpr/h3;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lzs/b;", "classId", "Las/k;", "moduleData", "Lvr/e;", "Q", "(Lzs/b;Las/k;)Lvr/e;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Lzs/f;", "name", "", "Lvr/z0;", "E", "(Lzs/f;)Ljava/util/Collection;", "Lvr/z;", "t", "", "index", "u", "(I)Lvr/z0;", "value", "", "A", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "Loq/k;", "Lpr/f0$b;", "e", "Loq/k;", "U", "()Loq/k;", "data", "Lmr/b;", "B", "()Ljava/util/Collection;", "members", "Lvr/l;", "s", "constructorDescriptors", ip.a.f96138c, "simpleName", "C", "qualifiedName", "z", "()Ljava/lang/Object;", "objectInstance", "", "Lmr/q;", "getTypeParameters", "()Ljava/util/List;", "typeParameters", "y", "sealedSubclasses", "x", "()Z", "isValue", "a0", "isInline", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Les/g;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Les/b;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "classKind", "Llt/k;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Les/g0;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "f", "b", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0<T> extends g1 implements mr.c<T>, b1, h3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f161802g;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Class<T> jClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k<f0<T>.b> data = oq.l.b(oq.o.PUBLICATION, new d0(this));

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001eR-\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0012\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010'R#\u00103\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010\f\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R!\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u001aR!\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u001aR)\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000+0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b=\u0010\u001aR%\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\bA\u0010'R%\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bD\u0010'R%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010'R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0012\u001a\u0004\bJ\u0010'R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0012\u001a\u0004\bM\u0010'R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0012\u001a\u0004\bP\u0010'R%\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0012\u001a\u0004\bS\u0010'R%\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0012\u001a\u0004\bV\u0010'¨\u0006X"}, d2 = {"Lpr/f0$b;", "Lpr/g1$b;", "Lpr/g1;", "<init>", "(Lpr/f0;)V", "Ljava/lang/Class;", "jClass", "", "C", "(Ljava/lang/Class;)Ljava/lang/String;", "Les/g;", "d", "Loq/k;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "Lvr/e;", "e", "Lpr/l3$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "f", "getAnnotations", "()Ljava/util/List;", "annotations", "g", "U", "()Ljava/lang/String;", "simpleName", "h", ip.a.f96137b, "qualifiedName", "", "Lmr/g;", "i", "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lmr/c;", "j", "getNestedClasses", "nestedClasses", "k", "R", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lmr/q;", "l", "V", "typeParameters", "Lmr/p;", "m", "getSupertypes", "supertypes", "n", "T", "sealedSubclasses", "Lpr/c0;", "o", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "declaredNonStaticMembers", "p", "M", "declaredStaticMembers", "q", "O", "inheritedNonStaticMembers", "r", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "inheritedStaticMembers", "s", "J", "allNonStaticMembers", "t", "K", "allStaticMembers", "u", "getDeclaredMembers", "declaredMembers", "v", "I", "allMembers", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class b extends g1.b {

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        static final /* synthetic */ mr.l<Object>[] f161805x = {fr.q0.j(new fr.h0(b.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), fr.q0.j(new fr.h0(b.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), fr.q0.j(new fr.h0(b.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), fr.q0.j(new fr.h0(b.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), fr.q0.j(new fr.h0(b.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), fr.q0.j(new fr.h0(b.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final oq.k kmClass;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final l3.a descriptor;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final l3.a annotations;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final l3.a simpleName;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final l3.a qualifiedName;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final l3.a constructors;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final l3.a nestedClasses;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final oq.k objectInstance;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final l3.a typeParameters;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final l3.a supertypes;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final l3.a sealedSubclasses;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final l3.a declaredNonStaticMembers;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final l3.a declaredStaticMembers;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final l3.a inheritedNonStaticMembers;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final l3.a inheritedStaticMembers;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        private final l3.a allNonStaticMembers;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final l3.a allStaticMembers;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
        private final l3.a declaredMembers;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
        private final l3.a allMembers;

        public b() {
            super();
            oq.o oVar = oq.o.PUBLICATION;
            this.kmClass = oq.l.b(oVar, new g0(this));
            this.descriptor = l3.b(new r0(f0.this));
            this.annotations = l3.b(new t0(f0.this));
            this.simpleName = l3.b(new u0(f0.this, this));
            this.qualifiedName = l3.b(new v0(f0.this));
            this.constructors = l3.b(new w0(f0.this));
            this.nestedClasses = l3.b(new x0(this, f0.this));
            this.objectInstance = oq.l.b(oVar, new y0(this, f0.this));
            this.typeParameters = l3.b(new z0(this, f0.this));
            this.supertypes = l3.b(new a1(this, f0.this));
            this.sealedSubclasses = l3.b(new h0(f0.this, this));
            this.declaredNonStaticMembers = l3.b(new i0(f0.this));
            this.declaredStaticMembers = l3.b(new j0(f0.this));
            this.inheritedNonStaticMembers = l3.b(new k0(f0.this));
            this.inheritedStaticMembers = l3.b(new l0(f0.this));
            this.allNonStaticMembers = l3.b(new m0(this));
            this.allStaticMembers = l3.b(new n0(this));
            this.declaredMembers = l3.b(new o0(this));
            this.allMembers = l3.b(new p0(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List A(b bVar) {
            return pq.v.L0(bVar.M(), bVar.P());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(f0 f0Var) {
            Annotation[] annotations = f0Var.a().getAnnotations();
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (!f0.f161802g.contains(dr.a.b(dr.a.a(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return y3.s(arrayList);
        }

        private final String C(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return fu.r.g1(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return fu.r.f1(simpleName, '$', null, 2, null);
            }
            return fu.r.g1(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List D(f0 f0Var) {
            Collection<vr.l> collectionS = f0Var.s();
            ArrayList arrayList = new ArrayList(pq.v.y(collectionS, 10));
            Iterator<T> it = collectionS.iterator();
            while (it.hasNext()) {
                arrayList.add(new l1(f0Var, (vr.l) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List E(b bVar) {
            return pq.v.L0(bVar.L(), bVar.M());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(f0 f0Var) {
            return f0Var.v(f0Var.Y(), g1.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection G(f0 f0Var) {
            return f0Var.v(f0Var.Z(), g1.d.DECLARED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final vr.e H(f0 f0Var) {
            zs.b bVarS = f0Var.S();
            as.k kVarB = f0Var.U().getValue().b();
            vr.e eVarB = (bVarS.i() && f0Var.a().isAnnotationPresent(Metadata.class)) ? kVarB.a().b(bVarS) : vr.y.b(kVarB.b(), bVarS);
            return eVarB == null ? f0Var.Q(bVarS, kVarB) : eVarB;
        }

        private final Collection<c0<?>> M() {
            return (Collection) this.declaredStaticMembers.e(this, f161805x[10]);
        }

        private final Collection<c0<?>> O() {
            return (Collection) this.inheritedNonStaticMembers.e(this, f161805x[11]);
        }

        private final Collection<c0<?>> P() {
            return (Collection) this.inheritedStaticMembers.e(this, f161805x[12]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection W(f0 f0Var) {
            return f0Var.v(f0Var.Y(), g1.d.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection X(f0 f0Var) {
            return f0Var.v(f0Var.Z(), g1.d.INHERITED);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final es.g Y(b bVar) {
            vr.e eVarN = bVar.N();
            qt.m mVar = eVarN instanceof qt.m ? (qt.m) eVarN : null;
            if (mVar != null) {
                return fs.g.j(mVar.k1(), mVar.j1().g(), false, null, 6, null);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Z(b bVar, f0 f0Var) {
            es.g gVarQ = bVar.Q();
            if (gVarQ == null) {
                Class<?>[] declaredClasses = f0Var.a().getDeclaredClasses();
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : declaredClasses) {
                    mr.c cVarE = dr.a.e(cls);
                    if (cVarE != null) {
                        arrayList.add(cVarE);
                    }
                }
                return arrayList;
            }
            zs.b bVarB = j3.b(gVarQ.l());
            ClassLoader classLoaderJ = bs.f.j(f0Var.a());
            List<String> listM = gVarQ.m();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM.iterator();
            while (it.hasNext()) {
                Class clsO = y3.o(classLoaderJ, bVarB.d(zs.f.l((String) it.next())), 0, 2, null);
                mr.c cVarE2 = clsO != null ? dr.a.e(clsO) : null;
                if (cVarE2 != null) {
                    arrayList2.add(cVarE2);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object a0(b bVar, f0 f0Var) {
            es.g gVarQ = bVar.Q();
            if (gVarQ == null || !(es.a.a(gVarQ) == es.b.OBJECT || es.a.a(gVarQ) == es.b.COMPANION_OBJECT)) {
                return null;
            }
            return ((es.a.a(gVarQ) != es.b.COMPANION_OBJECT || pq.v.c0(sr.d.f183551a.b(), j3.b(gVarQ.l()).e())) ? f0Var.a().getDeclaredField("INSTANCE") : f0Var.a().getEnclosingClass().getDeclaredField(j3.c(gVarQ.l()))).get(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String b0(f0 f0Var) {
            if (f0Var.a().isAnonymousClass()) {
                return null;
            }
            zs.b bVarS = f0Var.S();
            if (bVarS.i()) {
                return null;
            }
            return bVarS.a().a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List c0(f0 f0Var, b bVar) {
            ArrayList arrayList;
            ClassLoader classLoaderJ = bs.f.j(f0Var.a());
            es.g gVarQ = bVar.Q();
            if (gVarQ != null) {
                List<String> listN = gVarQ.n();
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = listN.iterator();
                while (it.hasNext()) {
                    mr.c<?> cVarA = j3.a(classLoaderJ, (String) it.next());
                    if (cVarA != null) {
                        arrayList2.add(cVarA);
                    }
                }
                return arrayList2;
            }
            bs.b bVar2 = bs.b.f21214a;
            if (!fr.t.c(bVar2.f(f0Var.a()), Boolean.TRUE)) {
                return pq.v.n();
            }
            Class<?>[] clsArrC = bVar2.c(f0Var.a());
            if (clsArrC != null) {
                arrayList = new ArrayList(clsArrC.length);
                for (Class<?> cls : clsArrC) {
                    arrayList.add(dr.a.e(cls));
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? pq.v.n() : arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String d0(f0 f0Var, b bVar) {
            if (f0Var.a().isAnonymousClass()) {
                return null;
            }
            zs.b bVarS = f0Var.S();
            return bVarS.i() ? bVar.C(f0Var.a()) : bVarS.h().e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List e0(b bVar, f0 f0Var) {
            Collection<st.t0> collectionQ = bVar.N().o().q();
            ArrayList arrayList = new ArrayList(collectionQ.size());
            for (st.t0 t0Var : collectionQ) {
                arrayList.add(new d3(t0Var, new q0(t0Var, bVar, f0Var)));
            }
            if (!sr.j.v0(bVar.N())) {
                if (arrayList.isEmpty()) {
                    arrayList.add(new d3(ht.e.m(bVar.N()).i(), s0.f161960a));
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        vr.f fVarK = dt.i.e(((d3) it.next()).getType()).k();
                        if (fVarK == vr.f.INTERFACE || fVarK == vr.f.ANNOTATION_CLASS) {
                        }
                    }
                    arrayList.add(new d3(ht.e.m(bVar.N()).i(), s0.f161960a));
                }
            }
            return cu.a.c(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type f0(st.t0 t0Var, b bVar, f0 f0Var) {
            vr.h hVarC = t0Var.T0().c();
            if (!(hVarC instanceof vr.e)) {
                throw new i3("Supertype not a class: " + hVarC);
            }
            Class<?> clsQ = y3.q((vr.e) hVarC);
            if (clsQ == null) {
                throw new i3("Unsupported superclass of " + bVar + ": " + hVarC);
            }
            if (fr.t.c(f0Var.a().getSuperclass(), clsQ)) {
                return f0Var.a().getGenericSuperclass();
            }
            int iD0 = pq.n.D0(f0Var.a().getInterfaces(), clsQ);
            if (iD0 >= 0) {
                return f0Var.a().getGenericInterfaces()[iD0];
            }
            throw new i3("No superclass of " + bVar + " in Java reflection for " + hVarC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Type g0() {
            return Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List h0(b bVar, f0 f0Var) {
            List<vr.m1> listV = bVar.N().v();
            ArrayList arrayList = new ArrayList(pq.v.y(listV, 10));
            Iterator<T> it = listV.iterator();
            while (it.hasNext()) {
                arrayList.add(new g3(f0Var, (vr.m1) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List y(b bVar) {
            return pq.v.L0(bVar.J(), bVar.K());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List z(b bVar) {
            return pq.v.L0(bVar.L(), bVar.O());
        }

        public final Collection<c0<?>> I() {
            return (Collection) this.allMembers.e(this, f161805x[16]);
        }

        public final Collection<c0<?>> J() {
            return (Collection) this.allNonStaticMembers.e(this, f161805x[13]);
        }

        public final Collection<c0<?>> K() {
            return (Collection) this.allStaticMembers.e(this, f161805x[14]);
        }

        public final Collection<c0<?>> L() {
            return (Collection) this.declaredNonStaticMembers.e(this, f161805x[9]);
        }

        public final vr.e N() {
            return (vr.e) this.descriptor.e(this, f161805x[0]);
        }

        public final es.g Q() {
            return (es.g) this.kmClass.getValue();
        }

        public final T R() {
            return (T) this.objectInstance.getValue();
        }

        public final String S() {
            return (String) this.qualifiedName.e(this, f161805x[3]);
        }

        public final List<mr.c<? extends T>> T() {
            return (List) this.sealedSubclasses.e(this, f161805x[8]);
        }

        public final String U() {
            return (String) this.simpleName.e(this, f161805x[2]);
        }

        public final List<mr.q> V() {
            return (List) this.typeParameters.e(this, f161805x[6]);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f161826a;

        static {
            int[] iArr = new int[ts.a.EnumC5006a.values().length];
            try {
                iArr[ts.a.EnumC5006a.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts.a.EnumC5006a.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ts.a.EnumC5006a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ts.a.EnumC5006a.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ts.a.EnumC5006a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ts.a.EnumC5006a.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f161826a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pr/f0$d", "Llt/f;", "", "Lvr/z;", "j", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d extends lt.f {
        d(yr.k kVar, rt.n nVar) {
            super(nVar, kVar);
        }

        @Override // lt.f
        protected List<vr.z> j() {
            return pq.v.n();
        }
    }

    static {
        Set<zs.b> setB = rr.a.f175535a.b();
        HashSet hashSet = new HashSet();
        Iterator<T> it = setB.iterator();
        while (it.hasNext()) {
            hashSet.add(((zs.b) it.next()).a().toString());
        }
        f161802g = hashSet;
    }

    public f0(Class<T> cls) {
        this.jClass = cls;
    }

    private final vr.e P(zs.b classId, as.k moduleData) {
        yr.k kVar = new yr.k(new yr.p(moduleData.b(), classId.f()), classId.h(), vr.f0.FINAL, vr.f.CLASS, pq.v.e(moduleData.b().i().h().t()), vr.h1.f208052a, false, moduleData.a().u());
        kVar.Q0(new d(kVar, moduleData.a().u()), pq.e1.e(), null);
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vr.e Q(zs.b classId, as.k moduleData) {
        ts.a aVarD;
        if (a().isSynthetic()) {
            return P(classId, moduleData);
        }
        as.f fVarA = as.f.f14280c.a(a());
        ts.a.EnumC5006a enumC5006aC = (fVarA == null || (aVarD = fVarA.d()) == null) ? null : aVarD.c();
        switch (enumC5006aC == null ? -1 : c.f161826a[enumC5006aC.ordinal()]) {
            case -1:
            case 6:
                throw new i3("Unresolved class: " + a() + " (kind = " + enumC5006aC + ')');
            case 0:
            default:
                throw new oq.p();
            case 1:
            case 2:
            case 3:
            case 4:
                return P(classId, moduleData);
            case 5:
                throw new i3("Unknown class: " + a() + " (kind = " + enumC5006aC + ')');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b R(f0 f0Var) {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zs.b S() {
        return u3.f161976a.c(a());
    }

    private final es.g W() {
        return this.data.getValue().Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vr.z0 X(ot.l0 l0Var, us.o oVar) {
        return l0Var.x(oVar, true);
    }

    @Override // mr.c
    public boolean A(Object value) {
        Integer numG = bs.f.g(a());
        if (numG != null) {
            return fr.w0.o(value, numG.intValue());
        }
        Class clsK = bs.f.k(a());
        if (clsK == null) {
            clsK = a();
        }
        return clsK.isInstance(value);
    }

    @Override // mr.c
    public Collection<mr.b<?>> B() {
        return this.data.getValue().I();
    }

    @Override // mr.c
    public String C() {
        return this.data.getValue().S();
    }

    @Override // mr.c
    public String D() {
        return this.data.getValue().U();
    }

    @Override // pr.g1
    public Collection<vr.z0> E(zs.f name) {
        lt.k kVarY = Y();
        ds.d dVar = ds.d.FROM_REFLECTION;
        return pq.v.L0(kVarY.c(name, dVar), Z().c(name, dVar));
    }

    public final es.b T() {
        es.b bVarA;
        es.g gVarW = W();
        if (gVarW != null && (bVarA = es.a.a(gVarW)) != null) {
            return bVarA;
        }
        if (a().isAnnotation()) {
            return es.b.ANNOTATION_CLASS;
        }
        if (a().isInterface()) {
            return es.b.INTERFACE;
        }
        if (a().isEnum()) {
            return es.b.ENUM_CLASS;
        }
        return a().getSuperclass().isEnum() ? es.b.ENUM_ENTRY : es.b.CLASS;
    }

    public final oq.k<f0<T>.b> U() {
        return this.data;
    }

    @Override // pr.b1
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public vr.e getDescriptor() {
        return this.data.getValue().N();
    }

    public final lt.k Y() {
        return getDescriptor().t().r();
    }

    public final lt.k Z() {
        return getDescriptor().q0();
    }

    @Override // fr.h
    public Class<T> a() {
        return this.jClass;
    }

    public final boolean a0() {
        es.g gVarW = W();
        return (gVarW != null ? gVarW.j() : null) != null;
    }

    public boolean equals(Object other) {
        return (other instanceof f0) && fr.t.c(dr.a.c(this), dr.a.c((mr.c) other));
    }

    @Override // mr.c
    public List<mr.q> getTypeParameters() {
        return this.data.getValue().V();
    }

    @Override // mr.c
    public int hashCode() {
        return dr.a.c(this).hashCode();
    }

    @Override // pr.g1
    public Collection<vr.l> s() {
        vr.e descriptor = getDescriptor();
        return (descriptor.k() == vr.f.INTERFACE || descriptor.k() == vr.f.OBJECT) ? pq.v.n() : descriptor.p();
    }

    @Override // pr.g1
    public Collection<vr.z> t(zs.f name) {
        lt.k kVarY = Y();
        ds.d dVar = ds.d.FROM_REFLECTION;
        return pq.v.L0(kVarY.a(name, dVar), Z().a(name, dVar));
    }

    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("class ");
        zs.b bVarS = S();
        zs.c cVarF = bVarS.f();
        if (cVarF.c()) {
            str = "";
        } else {
            str = cVarF.a() + '.';
        }
        sb5.append(str + fu.r.O(bVarS.g().a(), '.', '$', false, 4, null));
        return sb5.toString();
    }

    @Override // pr.g1
    public vr.z0 u(int index) {
        us.o oVar;
        Class<?> declaringClass;
        if (fr.t.c(a().getSimpleName(), "DefaultImpls") && (declaringClass = a().getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((f0) dr.a.e(declaringClass)).u(index);
        }
        vr.e descriptor = getDescriptor();
        qt.m mVar = descriptor instanceof qt.m ? (qt.m) descriptor : null;
        if (mVar == null || (oVar = (us.o) ws.f.b(mVar.k1(), xs.a.f220672j, index)) == null) {
            return null;
        }
        return (vr.z0) y3.h(a(), oVar, mVar.j1().g(), mVar.j1().j(), mVar.m1(), e0.f161789a);
    }

    @Override // mr.c
    public boolean x() {
        es.g gVarW = W();
        return gVarW != null && es.a.b(gVarW);
    }

    @Override // mr.c
    public List<mr.c<? extends T>> y() {
        return this.data.getValue().T();
    }

    @Override // mr.c
    public T z() {
        return this.data.getValue().R();
    }
}
