package mp;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a extends c {
    public a(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            a(entry.getKey().intValue(), entry.getValue());
        }
    }

    @Override // hp.c
    public bp.b D1() {
        throw new UnsupportedOperationException("Built-in encodings cannot be serialized");
    }

    @Override // mp.c
    public String d() {
        return "built-in (TTF)";
    }
}
