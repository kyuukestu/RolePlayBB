<div
	style="
		width: 50px;
		height: 50px;
		background: #fff;
		border: 2px solid #000;
		border-radius: 50%;
		overflow: hidden;
		box-shadow: inset -10px 10px 0 10px #ccc;
		box-sizing: box-border;
		transform: rotate(-25deg);
		z-index: 2;
	">
	<comment>==Yellow Background==</comment>
	<div
		style="
			background: yellow;
			width: 100%;
			height: 100%;
			position: absolute;
			top: -50%;
			box-sizing: box-border;
		"></div>
	<comment>==White Bottom==</comment>
	<div
		style="
			top: calc(50% - 10px);
			width: 100%;
			height: 100px;
			box-sizing: box-border;
		"></div>
	<comment>==Pokeball Button==</comment>
	<div
		style="
			position: absolute;
			top: calc(50% - 5px);
			left: calc(50% - 5px);
			width: 7px;
			height: 7px;
			background: #7f8c8d;
			border: 2px solid #fff;
			border-radius: 50%;
			z-index: 10;
			box-shadow: 0 0 0 2px black;
			box-sizing: box-border;
		"></div>
	<comment>==Right Spot==</comment>
	<div
		style="
			position: absolute;
			top: calc(-50% + 30px);
			left: calc(50% + 15px);
			border-radius: 75% 0 0 7%;
			border: 1px solid #000;
			height: 20px;
			width: 15px;
			background: black;
			z-index: 3;
			box-sizing: box-border;
		"></div>
	<comment>==Left spot==</comment>
	<div
		style="
			position: absolute;
			top: calc(-50% + 30px);
			left: calc(50% - 30px);
			border-radius: 0 75% 7% 0;
			border: 1px solid #000;
			height: 20px;
			width: 15px;
			background: black;
			z-index: 3;
			box-sizing: box-border;
		"></div>
	<comment>==Middle Spot==</comment>
	<div
		style="
			position: absolute;
			top: calc(-50% + 32px);
			left: calc(50% - 9px);
			border-radius: 20%;
			border: 1px solid #000;
			height: 18px;
			width: 18px;
			background: black;
			z-index: 3;
			box-sizing: box-border;
		"></div>
</div>
