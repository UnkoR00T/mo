package qr;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0015\u0017BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0015\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010&\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010'¨\u0006)"}, d2 = {"Lqr/a;", "Lqr/h;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "Lqr/a$a;", "callMode", "Lqr/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lqr/a$a;Lqr/a$b;Ljava/util/List;)V", "", "args", "", "v", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "Lqr/a$a;", "d", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "h", "()Ljava/lang/Void;", "member", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> parameterNames;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC4247a callMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Method> methods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Class<?>> erasedParameterTypes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Object> defaultValues;

    /* JADX INFO: renamed from: qr.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqr/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC4247a {
        CALL_BY_NAME,
        POSITIONAL_CALL;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f168151d = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqr/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "kotlin-reflection"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        JAVA,
        KOTLIN;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f168155d = wq.b.a(b());
    }

    public a(Class<?> cls, List<String> list, EnumC4247a enumC4247a, b bVar, List<Method> list2) {
        this.jClass = cls;
        this.parameterNames = list;
        this.callMode = enumC4247a;
        this.methods = list2;
        List<Method> list3 = list2;
        ArrayList arrayList = new ArrayList(v.y(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list4 = this.methods;
        ArrayList arrayList2 = new ArrayList(v.y(list4, 10));
        Iterator<T> it4 = list4.iterator();
        while (it4.hasNext()) {
            Class<?> returnType = ((Method) it4.next()).getReturnType();
            Class<?> clsK = bs.f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list5 = this.methods;
        ArrayList arrayList3 = new ArrayList(v.y(list5, 10));
        Iterator<T> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((Method) it5.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == EnumC4247a.POSITIONAL_CALL && bVar == b.JAVA && !v.I0(this.parameterNames, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // qr.h
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // qr.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) h();
    }

    @Override // qr.h
    public /* bridge */ boolean c() {
        return g();
    }

    public /* bridge */ void d(Object[] objArr) {
        e(objArr);
    }

    public void e(Object[] objArr) {
        if (j.a(this) == objArr.length) {
            return;
        }
        throw new IllegalArgumentException("Callable expects " + j.a(this) + " arguments, but " + objArr.length + " were provided.");
    }

    @Override // qr.h
    /* JADX INFO: renamed from: f */
    public Type getReturnType() {
        return this.jClass;
    }

    public boolean g() {
        return false;
    }

    public Void h() {
        return null;
    }

    @Override // qr.h
    public Object v(Object[] args) {
        d(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            Object obj = args[i15];
            int i17 = i16 + 1;
            Object objQ = (obj == null && this.callMode == EnumC4247a.CALL_BY_NAME) ? this.defaultValues.get(i16) : f.q(obj, this.erasedParameterTypes.get(i16));
            if (objQ == null) {
                f.p(i16, this.parameterNames.get(i16), this.erasedParameterTypes.get(i16));
                throw new oq.g();
            }
            arrayList.add(objQ);
            i15++;
            i16 = i17;
        }
        return f.g(this.jClass, v0.s(v.p1(this.parameterNames, arrayList)), this.methods);
    }

    public /* synthetic */ a(Class cls, List list, EnumC4247a enumC4247a, b bVar, List list2, int i15, fr.k kVar) {
        List list3;
        if ((i15 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(v.y(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, enumC4247a, bVar, list3);
    }
}
