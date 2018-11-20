package com.demo.common;

public class EnumType {
	/**
	 * 
	 * <p>
	 * Description: [店铺类型枚举]
	 * </p>
	 */
	public enum OtoType {
		NOTO(1, "非O2O类型"), YOTO(2, "O2O类型");

		private int code;
		private String label;

		OtoType(int code, String label) {
			this.code = code;
			this.label = label;
		}

		public static OtoType getEnumBycode(Integer code) {
			if (code != null) {
				for (OtoType otoType : OtoType.values()) {
					if (otoType.getCode() == code) {
						return otoType;
					}
				}
			}
			return null;
		}

		public int getCode() {
			return code;
		}

		public String getLabel() {
			return label;
		}
	}
}
