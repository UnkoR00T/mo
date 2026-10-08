package xn;

import io.n;
import java.net.URI;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class e {
    static sn.b a(Map<String, Object> map) {
        return sn.b.b(io.k.h(map, "alg"));
    }

    static Date b(Map<String, Object> map) {
        if (map.get("exp") == null) {
            return null;
        }
        return ko.a.a(io.k.g(map, "exp"));
    }

    static Date c(Map<String, Object> map) {
        if (map.get("iat") == null) {
            return null;
        }
        return ko.a.a(io.k.g(map, "iat"));
    }

    static String d(Map<String, Object> map) {
        return io.k.h(map, "kid");
    }

    static Set<f> e(Map<String, Object> map) {
        return f.g(io.k.j(map, "key_ops"));
    }

    static g f(Map<String, Object> map) {
        if (map.get("revoked") == null) {
            return null;
        }
        return g.c(io.k.f(map, "revoked"));
    }

    static h g(Map<String, Object> map) throws ParseException {
        try {
            return h.b(io.k.h(map, "kty"));
        } catch (IllegalArgumentException e15) {
            throw new ParseException(e15.getMessage(), 0);
        }
    }

    static i h(Map<String, Object> map) {
        return i.c(io.k.h(map, "use"));
    }

    static Date i(Map<String, Object> map) {
        if (map.get("nbf") == null) {
            return null;
        }
        return ko.a.a(io.k.g(map, "nbf"));
    }

    static List<io.a> j(Map<String, Object> map) throws ParseException {
        List<io.a> listB = n.b(io.k.e(map, "x5c"));
        if (listB == null || !listB.isEmpty()) {
            return listB;
        }
        return null;
    }

    static io.c k(Map<String, Object> map) {
        return io.k.a(map, "x5t#S256");
    }

    static io.c l(Map<String, Object> map) {
        return io.k.a(map, "x5t");
    }

    static URI m(Map<String, Object> map) {
        return io.k.k(map, "x5u");
    }
}
