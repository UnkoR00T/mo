package ur;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pq.e1;
import ss.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f200113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f200114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f200115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f200116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<String> f200117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<String> f200118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f200119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<String> f200120h;

    static {
        x xVar = new x();
        f200113a = xVar;
        f0 f0Var = f0.f183849a;
        f200114b = e1.m(f0Var.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f200115c = e1.l(e1.l(e1.l(e1.l(e1.l(e1.l(xVar.b(), f0Var.f(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), f0Var.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), f0Var.e(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37037x0, "isInfinite()Z", "isNaN()Z")), f0Var.e("Float", "isInfinite()Z", "isNaN()Z")), f0Var.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), f0Var.e("CharSequence", "isEmpty()Z"));
        f200116d = f0Var.f(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f200117e = e1.l(e1.l(e1.l(e1.l(e1.l(e1.l(f0Var.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), f0Var.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), f0Var.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), f0Var.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), f0Var.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), f0Var.f(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f200118f = e1.l(e1.l(f0Var.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), f0Var.f(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.e.f37042d, "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), f0Var.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setA = xVar.a();
        String[] strArrB = f0Var.b(ip.a.f96138c);
        Set setL = e1.l(setA, f0Var.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = f0Var.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f200119g = e1.l(setL, f0Var.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = f0Var.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f200120h = f0Var.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set<String> a() {
        f0 f0Var = f0.f183849a;
        jt.e eVar = jt.e.BOOLEAN;
        jt.e eVar2 = jt.e.BYTE;
        List listQ = pq.v.q(eVar, eVar2, jt.e.DOUBLE, jt.e.FLOAT, eVar2, jt.e.INT, jt.e.LONG, jt.e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            String strE = ((jt.e) it.next()).o().f().e();
            String[] strArrB = f0Var.b("Ljava/lang/String;");
            pq.v.D(linkedHashSet, f0Var.e(strE, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        f0 f0Var = f0.f183849a;
        List<jt.e> listQ = pq.v.q(jt.e.BOOLEAN, jt.e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (jt.e eVar : listQ) {
            pq.v.D(linkedHashSet, f0Var.e(eVar.o().f().e(), eVar.k() + "Value()" + eVar.j()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f200116d;
    }

    public final Set<String> d() {
        return f200114b;
    }

    public final Set<String> e() {
        return f200119g;
    }

    public final Set<String> f() {
        return f200115c;
    }

    public final Set<String> g() {
        return f200118f;
    }

    public final Set<String> h() {
        return f200120h;
    }

    public final Set<String> i() {
        return f200117e;
    }

    public final boolean j(zs.d dVar) {
        return fr.t.c(dVar, sr.p.a.f183645i) || sr.p.e(dVar);
    }

    public final boolean k(zs.d dVar) {
        if (j(dVar)) {
            return true;
        }
        zs.b bVarN = c.f200031a.n(dVar);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
