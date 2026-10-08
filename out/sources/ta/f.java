package ta;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "C", "Ljava/lang/Class;", "klass", "", "suffix", "a", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final <T, C> T a(Class<C> cls, String str) {
        String name;
        String str2;
        Package r15 = cls.getPackage();
        if (r15 == null || (name = r15.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = fu.r.O(canonicalName, '.', '_', false, 4, null) + str;
        try {
            if (name.length() == 0) {
                str2 = str3;
            } else {
                str2 = name + '.' + str3;
            }
            return (T) Class.forName(str2, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist. Is Room annotation processor correctly configured?", e15);
        } catch (IllegalAccessException e16) {
            throw new RuntimeException("Cannot access the constructor " + cls.getCanonicalName(), e16);
        } catch (InstantiationException e17) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName(), e17);
        }
    }

    public static /* synthetic */ Object b(Class cls, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = "_Impl";
        }
        return a(cls, str);
    }
}
