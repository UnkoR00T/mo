package qo;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class a extends b {
    public a(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            a(entry.getKey().intValue(), entry.getValue());
        }
    }
}
